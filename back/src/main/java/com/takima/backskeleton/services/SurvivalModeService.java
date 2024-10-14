package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.SurvivalModeDao;
import com.takima.backskeleton.models.Duel;
import com.takima.backskeleton.models.Quiz;
import com.takima.backskeleton.models.SurvivalMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SurvivalModeService {
    @Autowired
    private SurvivalModeDao survivalModeDao;

    public SurvivalMode saveSurvivalMode(SurvivalMode survivalMode) {return survivalModeDao.save(survivalMode);}

    public void deleteSurvivalMode(Long id) {
        survivalModeDao.deleteById(id);
    }


    public Optional<SurvivalMode> getSurvivalModeById(Long id) {
        return survivalModeDao.findById(id);
    }
}
