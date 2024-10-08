package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "game_sessions")
@Getter
public class GameSession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Quiz quiz;

    @ManyToMany
    private List<Player> players;

    private int currentQuestionIndex;
    private Instant startTime;
    private Instant endTime;

    @ElementCollection
    private List<Integer> scores;

    public GameSession() {}

    // Builder pattern
    public static class Builder {
        private Long id;
        private Quiz quiz;
        private List<Player> players;
        private int currentQuestionIndex;
        private Instant startTime;
        private Instant endTime;
        private List<Integer> scores;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder quiz(Quiz quiz) {
            this.quiz = quiz;
            return this;
        }

        public Builder players(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder currentQuestionIndex(int currentQuestionIndex) {
            this.currentQuestionIndex = currentQuestionIndex;
            return this;
        }

        public Builder startTime(Instant startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder endTime(Instant endTime) {
            this.endTime = endTime;
            return this;
        }

        public Builder scores(List<Integer> scores) {
            this.scores = scores;
            return this;
        }

        public GameSession build() {
            GameSession gameSession = new GameSession();
            gameSession.id = this.id;
            gameSession.quiz = this.quiz;
            gameSession.players = this.players;
            gameSession.currentQuestionIndex = this.currentQuestionIndex;
            gameSession.startTime = this.startTime;
            gameSession.endTime = this.endTime;
            gameSession.scores = this.scores;
            return gameSession;
        }
    }
}
