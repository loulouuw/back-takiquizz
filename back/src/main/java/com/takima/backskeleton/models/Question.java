package com.takima.backskeleton.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "questions")
@Getter
@Setter
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String statement;
    private String correctAnswer;
    private String questionType;
    private String image;
    private int timeLimit; // Time in seconds for this specific question

    @ElementCollection
    @CollectionTable(name = "question_incorrect_answers", joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "incorrect_answer")
    private List<String> incorrectAnswers;


    @ManyToOne
    @JoinColumn(name = "quiz_id")
    @JsonIgnore
    private Quiz quiz;

    public Question() {}

    // Builder pattern
    public static class Builder {
        private Integer id;
        private String statement;
        private String correctAnswer;
        private String questionType;
        private String image;
        private int timeLimit;
        private List<String> incorrectAnswers;
        private Quiz quiz;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder statement(String statement) {
            this.statement = statement;
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

        public Builder incorrectAnswers(List<String> incorrectAnswers) {
            this.incorrectAnswers = incorrectAnswers;
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
            question.correctAnswer = this.correctAnswer;
            question.questionType = this.questionType;
            question.image = this.image;
            question.timeLimit = this.timeLimit;
            question.incorrectAnswers = this.incorrectAnswers;
            question.quiz = this.quiz;
            return question;
        }
    }
}
