package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.GameSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameSessionDao extends JpaRepository<GameSession, Long> {
    GameSession save(GameSession gameSession);
    GameSession findById(long id);
}
