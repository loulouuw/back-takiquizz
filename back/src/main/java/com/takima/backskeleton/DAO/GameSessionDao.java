package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.GameSession;
import com.takima.backskeleton.models.SurvivalMode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameSessionDao extends JpaRepository<GameSession, Long> {
    GameSession findById(long id);
}
