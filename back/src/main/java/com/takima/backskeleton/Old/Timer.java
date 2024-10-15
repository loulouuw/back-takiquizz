//package com.takima.backskeleton.models;
//
//import jakarta.persistence.*;
//import lombok.Getter;
//
//import java.time.Instant;
//
//@Entity
//@Table(name = "timers")
//@Getter
//public class Timer {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private Instant startTime;
//    private int timeLimit; // Time limit in seconds
//    private boolean isExpired;
//
//    public Timer() {}
//
//    // Builder pattern
//    public static class Builder {
//        private Long id;
//        private Instant startTime;
//        private int timeLimit;
//        private boolean isExpired;
//
//        public Builder id(Long id) {
//            this.id = id;
//            return this;
//        }
//
//        public Builder startTime(Instant startTime) {
//            this.startTime = startTime;
//            return this;
//        }
//
//        public Builder timeLimit(int timeLimit) {
//            this.timeLimit = timeLimit;
//            return this;
//        }
//
//        public Builder isExpired(boolean isExpired) {
//            this.isExpired = isExpired;
//            return this;
//        }
//
//        public Timer build() {
//            Timer timer = new Timer();
//            timer.id = this.id;
//            timer.startTime = this.startTime;
//            timer.timeLimit = this.timeLimit;
//            timer.isExpired = this.isExpired;
//            return timer;
//        }
//    }
//}
