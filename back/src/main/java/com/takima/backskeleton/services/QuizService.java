package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.QuizDao;
import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

public class QuizService {
    @Autowired
    private QuizDao quizDao;

    public List<Quiz> getAllQuiz() {
        return quizDao.findAll();
    }

    public List<Quiz> getQuizbyName(String title) {
        return quizDao.findByTitle(title);
    }

    public Quiz getQuizById(long id) {
        return quizDao.findById(id);
    }

    public List<Question> getQuestionById(long id) {
        return quizDao.findQuestionsById(id);
    }
}
