package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Table(name = "duels")
@Getter
public class Duel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "player1_id")
    private Player player1;

    @ManyToOne
    @JoinColumn(name = "player2_id")
    private Player player2;

    @ManyToOne
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "winner_id")
    private Player winner;

    private int player1Score;
    private int player2Score;

    public Duel() {}

    // Builder pattern
    public static class Builder {
        private Long id;
        private Player player1;
        private Player player2;
        private Quiz quiz;
        private Player winner;
        private int player1Score;
        private int player2Score;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder player1(Player player1) {
            this.player1 = player1;
            return this;
        }

        public Builder player2(Player player2) {
            this.player2 = player2;
            return this;
        }

        public Builder quiz(Quiz quiz) {
            this.quiz = quiz;
            return this;
        }

        public Builder winner(Player winner) {
            this.winner = winner;
            return this;
        }

        public Builder player1Score(int player1Score) {
            this.player1Score = player1Score;
            return this;
        }

        public Builder player2Score(int player2Score) {
            this.player2Score = player2Score;
            return this;
        }

        public Duel build() {
            Duel duel = new Duel();
            duel.id = this.id;
            duel.player1 = this.player1;
            duel.player2 = this.player2;
            duel.quiz = this.quiz;
            duel.winner = this.winner;
            duel.player1Score = this.player1Score;
            duel.player2Score = this.player2Score;
            return duel;
        }
    }
}
