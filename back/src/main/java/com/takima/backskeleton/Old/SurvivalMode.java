//package com.takima.backskeleton.models;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//
//@Entity
//@Table(name = "survival_modes")
//@Getter
//public class SurvivalMode {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "player_id")
//    private Player player;
//
//    @ManyToOne
//    private Quiz quiz;
//
//    private int questionsAnswered;
//    private boolean isEliminated;
//
//    public SurvivalMode() {}
//
//    // Builder pattern
//    public static class Builder {
//        private Long id;
//        private Player player;
//        private Quiz quiz;
//        private int questionsAnswered;
//        private boolean isEliminated;
//
//        public Builder id(Long id) {
//            this.id = id;
//            return this;
//        }
//
//        public Builder player(Player player) {
//            this.player = player;
//            return this;
//        }
//
//        public Builder quiz(Quiz quiz) {
//            this.quiz = quiz;
//            return this;
//        }
//
//        public Builder questionsAnswered(int questionsAnswered) {
//            this.questionsAnswered = questionsAnswered;
//            return this;
//        }
//
//        public Builder isEliminated(boolean isEliminated) {
//            this.isEliminated = isEliminated;
//            return this;
//        }
//
//        public SurvivalMode build() {
//            SurvivalMode survivalMode = new SurvivalMode();
//            survivalMode.id = this.id;
//            survivalMode.player = this.player;
//            survivalMode.quiz = this.quiz;
//            survivalMode.questionsAnswered = this.questionsAnswered;
//            survivalMode.isEliminated = this.isEliminated;
//            return survivalMode;
//        }
//    }
//}
