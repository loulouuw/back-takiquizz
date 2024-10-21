package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.GameSession;
import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.models.Quiz;
import com.takima.backskeleton.models.dto.GameSessionInputDto;
import com.takima.backskeleton.models.dto.QuestionInputDto;
import com.takima.backskeleton.services.GameSessionService;
import com.takima.backskeleton.services.PlayerService;
import com.takima.backskeleton.services.QuestionService;
import com.takima.backskeleton.services.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/gamesessions")
public class GameSessionControler {

    private GameSessionService gameSessionService;

    private QuizService quizService;
    private PlayerService playerService;

    public GameSessionControler(GameSessionService gameSessionService, QuizService quizService, PlayerService playerService) {
        this.gameSessionService = gameSessionService;
        this.quizService = quizService;
        this.playerService = playerService;
    }
    @GetMapping("/{id}")
    public ResponseEntity<GameSession> getGameSessionById(@PathVariable Long id) {
        Optional<GameSession> gameSession = gameSessionService.getGameSessionById(id);
        return gameSession.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("")
    public GameSession saveGameSession(@RequestBody GameSessionInputDto gameSessionDto) {
        Quiz quiz =  quizService.getQuizById(gameSessionDto.getQuizzId());
        Optional<Player> player1 = playerService.getPlayerById(gameSessionDto.getPlayerId1());
        Optional<Player> player2 = playerService.getPlayerById(gameSessionDto.getPlayerId2());
        GameSession gameSession = new GameSession.Builder()
                .score1(gameSessionDto.getScore1())
                .score2(gameSessionDto.getScore2())
                .startTime(gameSessionDto.getStartTime())
                .endTime(gameSessionDto.getEndTime())
                .player1Id(player1.get().getId())
                .player2Id(player2.get().getId())
                .quiz(quiz)
                .build();
        return gameSessionService.saveGameSession(gameSession);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGameSession(@PathVariable Long id) {
        gameSessionService.deleteGameSession(id);
        return ResponseEntity.noContent().build();
    }

}
