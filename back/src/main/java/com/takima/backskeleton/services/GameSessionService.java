package com.takima.backskeleton.services;
import com.takima.backskeleton.DAO.GameSessionDao;
import com.takima.backskeleton.models.GameSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class GameSessionService {

    private GameSessionDao gameSessionDao;

    public GameSessionService(GameSessionDao gameSessionDao) {
        this.gameSessionDao = gameSessionDao;
    }

    public GameSession saveGameSession(GameSession gameSession) {return gameSessionDao.save(gameSession);}

    public void deleteGameSession(Long id) {
        gameSessionDao.deleteById(id);
    }

    public Optional<GameSession> getGameSessionById(Long id) {
        return gameSessionDao.findById(id);
    }
}
