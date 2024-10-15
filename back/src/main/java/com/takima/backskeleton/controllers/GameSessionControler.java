package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.GameSession;
import com.takima.backskeleton.services.GameSessionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/gamesessions")
public class GameSessionControler {

    private GameSessionService gameSessionService;

    public GameSessionControler(GameSessionService gameSessionService) {
        this.gameSessionService = gameSessionService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameSession> getGameSessionById(@PathVariable Long id) {
        Optional<GameSession> gameSession = gameSessionService.getGameSessionById(id);
        return gameSession.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("")
    public GameSession saveGameSession(@RequestBody GameSession gameSession) {
        return gameSessionService.saveGameSession(gameSession);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGameSession(@PathVariable Long id) {
        gameSessionService.deleteGameSession(id);
        return ResponseEntity.noContent().build();
    }

}
