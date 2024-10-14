package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerDao extends JpaRepository <Player, Long> {
    Player save(Player player);
    Player findByUsername(String username);
    List<Player> findAll();
    List<Player> findByEmail(String email);
    List<Player> findByTotalPointsGreaterThan(int points);
    List<Player> findByDuelVictories(int victories);

}
