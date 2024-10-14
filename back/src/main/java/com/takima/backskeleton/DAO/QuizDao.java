package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import com.takima.backskeleton.models.Quiz;

import java.util.List;

public interface QuizDao extends JpaRepository<Quiz, Long>{
    List<Quiz> findByTitle(String title);
    List<Quiz> findAll();
    Quiz findById(long id);
}
