package com.takima.backskeleton.services;
import com.takima.backskeleton.DAO.GameSessionDao;
import com.takima.backskeleton.models.Duel;
import com.takima.backskeleton.models.GameSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class GameSessionService {
    @Autowired

    private GameSessionDao gameSessionDao;

    public GameSession saveGameSession(GameSession gameSession) {return gameSessionDao.save(gameSession);}

    public void deleteGameSession(Long id) {
        gameSessionDao.deleteById(id);
    }

    private Optional<GameSession> getGameSessionById(Long id) {
        return gameSessionDao.findById(id);
    }
}
