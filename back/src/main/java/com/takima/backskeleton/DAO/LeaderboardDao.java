package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Leaderboard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderboardDao extends JpaRepository <Leaderboard, Long> {
    Leaderboard save(Leaderboard leaderboard);
    Leaderboard findLeaderboardById(Long id);
}
