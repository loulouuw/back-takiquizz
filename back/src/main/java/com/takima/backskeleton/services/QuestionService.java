package com.takima.backskeleton.services;

import com.takima.backskeleton.DAO.QuestionDao;
import com.takima.backskeleton.DAO.QuestionDao;
import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionDao questionDao;

    public List<Question> getAllQuestion() {
        return questionDao.findAll();
    }

    public Question getQuestionById(long id) {
        return questionDao.findById(id);
    }

    public List<Question> getQuestionByType(String questionType) {
        return questionDao.findByQuestionType(questionType);
    }
}
