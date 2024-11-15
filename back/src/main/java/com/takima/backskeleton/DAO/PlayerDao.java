package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerDao extends JpaRepository <Player, Long> {
    Player findByUsername(String username);
    List<Player> findAll();
    Player findById(long id);
    Player findByEmail(String email);
    List<Player> findByTotalPointsGreaterThan(int points);
    boolean existsByEmail(String email);
    boolean existsByUsername(String username);
}
