package com.takima.backskeleton.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "players")
@Getter
@Setter
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "players_id_seq")
    private Integer id;
    private String username;
    private String email;
    private int totalPoints;


    public Player() {}

    // Builder pattern
    public static class Builder {
        private Integer id;
        private String username;
        private String email;
        private int totalPoints;

        public Builder id(Integer id) {
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


        public Player build() {
            Player player = new Player();
            player.id = this.id;
            player.username = this.username;
            player.email = this.email;
            player.totalPoints = this.totalPoints;
            return player;
        }
    }
}
