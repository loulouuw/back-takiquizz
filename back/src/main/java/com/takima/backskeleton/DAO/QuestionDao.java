package com.takima.backskeleton.DAO;

import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionDao extends JpaRepository<Question, Long>{
    Question save(Question question);
    List<Question> findAll();
    Question findById(long id);
    List<Question> findByQuestionType(String questionType);
}
