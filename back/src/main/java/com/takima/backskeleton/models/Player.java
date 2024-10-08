package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name = "players")
@Getter
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String email;
    private int totalPoints;

    @ManyToMany(mappedBy = "players")
    private List<Quiz> quizzesPlayed;

    private int duelVictories;

    public Player() {}

    // Builder pattern
    public static class Builder {
        private Long id;
        private String username;
        private String email;
        private int totalPoints;
        private List<Quiz> quizzesPlayed;
        private int duelVictories;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder totalPoints(int totalPoints) {
            this.totalPoints = totalPoints;
            return this;
        }

        public Builder quizzesPlayed(List<Quiz> quizzesPlayed) {
            this.quizzesPlayed = quizzesPlayed;
            return this;
        }

        public Builder duelVictories(int duelVictories) {
            this.duelVictories = duelVictories;
            return this;
        }

        public Player build() {
            Player player = new Player();
            player.id = this.id;
            player.username = this.username;
            player.email = this.email;
            player.totalPoints = this.totalPoints;
            player.quizzesPlayed = this.quizzesPlayed;
            player.duelVictories = this.duelVictories;
            return player;
        }
    }
}
