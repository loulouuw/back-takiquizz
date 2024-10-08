package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "leaderboards")
@Getter
public class Leaderboard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToMany
    private List<Player> players;

    @ElementCollection
    private List<Integer> scores;

    public Leaderboard() {}

    // Builder pattern
    public static class Builder {
        private Long id;
        private List<Player> players;
        private List<Integer> scores;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder players(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder scores(List<Integer> scores) {
            this.scores = scores;
            return this;
        }

        public Leaderboard build() {
            Leaderboard leaderboard = new Leaderboard();
            leaderboard.id = this.id;
            leaderboard.players = this.players;
            leaderboard.scores = this.scores;
            return leaderboard;
        }
    }
}
