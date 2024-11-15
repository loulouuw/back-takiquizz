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

    private QuestionDao questionDao;

    public QuestionService(QuestionDao questionDao) {
        this.questionDao = questionDao;
    }

    public Question saveQuestion(Question question) {
        return questionDao.save(question);}

    public void deleteQuestion(Long id) {
        questionDao.deleteById(id);
    }

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
