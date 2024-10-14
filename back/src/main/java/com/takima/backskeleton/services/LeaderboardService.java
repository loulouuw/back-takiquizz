package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.DuelDao;
import com.takima.backskeleton.DAO.LeaderboardDao;
import com.takima.backskeleton.models.Duel;
import com.takima.backskeleton.models.Leaderboard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class LeaderboardService {
    @Autowired
    private LeaderboardDao leaderboardDao;

    public Optional<Leaderboard> getLeadearboardById(Long id) {
        return leaderboardDao.findById(id);
    }

}
