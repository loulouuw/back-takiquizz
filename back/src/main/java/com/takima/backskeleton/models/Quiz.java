package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "quizzes")
@Getter
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<Question> questions;

    private boolean isSurvivalMode;
    private int timeLimitPerQuestion; // Time in seconds

    public Quiz() {}

    // Builder pattern for more flexibility
    public static class Builder {
        private Long id;
        private String title;
        private String description;
        private List<Question> questions;
        private boolean isSurvivalMode;
        private int timeLimitPerQuestion;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder questions(List<Question> questions) {
            this.questions = questions;
            return this;
        }

        public Builder isSurvivalMode(boolean isSurvivalMode) {
            this.isSurvivalMode = isSurvivalMode;
            return this;
        }

        public Builder timeLimitPerQuestion(int timeLimitPerQuestion) {
            this.timeLimitPerQuestion = timeLimitPerQuestion;
            return this;
        }

        public Quiz build() {
            Quiz quiz = new Quiz();
            quiz.id = this.id;
            quiz.title = this.title;
            quiz.description = this.description;
            quiz.questions = this.questions;
            quiz.isSurvivalMode = this.isSurvivalMode;
            quiz.timeLimitPerQuestion = this.timeLimitPerQuestion;
            return quiz;
        }
    }
}
