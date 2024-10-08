package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "questions")
@Getter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String statement;

    @ElementCollection
    private List<String> options;

    private String correctAnswer;
    private String questionType;
    private String image;
    private int timeLimit; // Time in seconds for this specific question

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    public Question() {}

    // Builder pattern
    public static class Builder {
        private Long id;
        private String statement;
        private List<String> options;
        private String correctAnswer;
        private String questionType;
        private String image;
        private int timeLimit;
        private Quiz quiz;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder statement(String statement) {
            this.statement = statement;
            return this;
        }

        public Builder options(List<String> options) {
            this.options = options;
            return this;
        }

        public Builder correctAnswer(String correctAnswer) {
            this.correctAnswer = correctAnswer;
            return this;
        }

        public Builder questionType(String questionType) {
            this.questionType = questionType;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder timeLimit(int timeLimit) {
            this.timeLimit = timeLimit;
            return this;
        }

        public Builder quiz(Quiz quiz) {
            this.quiz = quiz;
            return this;
        }

        public Question build() {
            Question question = new Question();
            question.id = this.id;
            question.statement = this.statement;
            question.options = this.options;
            question.correctAnswer = this.correctAnswer;
            question.questionType = this.questionType;
            question.image = this.image;
            question.timeLimit = this.timeLimit;
            question.quiz = this.quiz;
            return question;
        }
    }
}
