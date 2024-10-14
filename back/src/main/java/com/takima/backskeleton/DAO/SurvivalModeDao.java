package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.SurvivalMode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurvivalModeDao extends JpaRepository <SurvivalMode, Long>{
    SurvivalMode findById(long id);
}
