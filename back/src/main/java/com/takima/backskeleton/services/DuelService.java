package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.DuelDao;
import com.takima.backskeleton.models.Duel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DuelService {
    @Autowired

    private DuelDao duelDao;

    public Optional<Duel> getDuelById(Long id) {
        return duelDao.findById(id);
    }


}