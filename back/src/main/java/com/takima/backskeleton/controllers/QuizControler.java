package com.takima.backskeleton.controllers;


import com.takima.backskeleton.models.Quiz;
import com.takima.backskeleton.models.dto.QuizzResponseDto;
import com.takima.backskeleton.services.QuizService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quizzes")
@CrossOrigin(origins = "http://localhost:4200")
public class QuizControler {

    private QuizService quizService;

    public QuizControler(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Quiz> getQuizById(@PathVariable Long id) {
        Quiz quiz = quizService.getQuizById(id);
        return quiz != null ? ResponseEntity.ok(quiz) : ResponseEntity.notFound().build();
    }

    @GetMapping("")
    public List<Quiz> getAllQuizzes() {
        return quizService.getAllQuiz();
    }

    @PostMapping("")
    public ResponseEntity<QuizzResponseDto> saveQuiz(@RequestBody Quiz quiz) {
        Quiz savedQuiz = quizService.saveQuiz(quiz);

        QuizzResponseDto responseDto = new QuizzResponseDto(savedQuiz.getId());

        return ResponseEntity.ok(responseDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteQuiz(@PathVariable Long id) {
        quizService.deleteQuiz(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/title/{title}")
    public List<Quiz> getQuizzesByTitle(@PathVariable String title) {
        return quizService.getQuizbyName(title);
    }
}
