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
    private Integer id;

    @ManyToOne
    private Quiz quiz;

    @ManyToMany
    private List<Player> players;

    private int currentQuestionIndex;
    private Instant startTime;
    private Instant endTime;

    private int score1;
    private int score2;

    private int playerId1;
    private int playerId2;

    public GameSession() {}

    // Builder pattern
    public static class Builder {
        private Integer id;
        private Quiz quiz;
        private int currentQuestionIndex;
        private Instant startTime;
        private Instant endTime;
        private int score1;
        private int score2;
        private int playerId1;
        private int playerId2;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder quiz(Quiz quiz) {
            this.quiz = quiz;
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

        public Builder score1(int score1) {
            this.score1 = score1;
            return this;
        }

        public Builder score2(int score2) {
            this.score2 = score2;
            return this;
        }
        public Builder player1Id(int playerId1) {
            this.playerId1 = playerId1;
            return this;
        }
        public Builder player2Id(int playerId2) {
            this.playerId2 = playerId2;
            return this;
        }

        public GameSession build() {
            GameSession gameSession = new GameSession();
            gameSession.id = this.id;
            gameSession.quiz = this.quiz;
            gameSession.currentQuestionIndex = this.currentQuestionIndex;
            gameSession.startTime = this.startTime;
            gameSession.endTime = this.endTime;
            gameSession.score1 = this.score1;
            gameSession.score2 = this.score2;
            gameSession.playerId1 = this.playerId1;
            gameSession.playerId2 = this.playerId2;
            return gameSession;
        }
    }
}
