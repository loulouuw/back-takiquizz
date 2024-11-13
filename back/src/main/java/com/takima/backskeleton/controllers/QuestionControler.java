package com.takima.backskeleton.controllers;

import com.takima.backskeleton.models.Question;
import com.takima.backskeleton.models.Quiz;
import com.takima.backskeleton.models.dto.QuestionInputDto;
import com.takima.backskeleton.services.QuestionService;
import com.takima.backskeleton.services.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
@CrossOrigin(origins = "http://localhost:4200")
public class QuestionControler {

    private QuestionService questionService;
    private QuizService quizService;

    public QuestionControler(QuestionService questionService, QuizService quizService) {
        this.questionService = questionService;
        this.quizService = quizService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Question> getQuestionById(@PathVariable Long id) {
        Question question = questionService.getQuestionById(id);
        return question != null ? ResponseEntity.ok(question) : ResponseEntity.notFound().build();
    }

    @GetMapping("")
    public List<Question> getAllQuestions() {
        return questionService.getAllQuestion();
    }

    @PostMapping("")
    public Question saveQuestion(@RequestBody QuestionInputDto questionDto) {
        Quiz quiz =  quizService.getQuizById(questionDto.getQuizzId());
        Question question = new Question.Builder()
                .correctAnswer(questionDto.getCorrectAnswer())
                .statement(questionDto.getStatement())
                .questionType(questionDto.getQuestionType())
                .timeLimit(questionDto.getTimeLimit())
                .image(questionDto.getImage())
                .quiz(quiz)
                .build();

        return questionService.saveQuestion(question);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuestion(@PathVariable Long id) {
        questionService.deleteQuestion(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/type/{type}")
    public List<Question> getQuestionsByType(@PathVariable String type) {
        return questionService.getQuestionByType(type);
    }
}
