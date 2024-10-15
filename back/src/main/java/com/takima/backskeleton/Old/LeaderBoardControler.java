//package com.takima.backskeleton.controllers;
//
//import com.takima.backskeleton.models.Leaderboard;
//import com.takima.backskeleton.services.LeaderboardService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/leaderboards")
//public class LeaderBoardControler {
//
//    private LeaderboardService leaderboardService;
//
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Leaderboard> getLeaderboardById(@PathVariable Long id) {
//        Optional<Leaderboard> leaderboard = leaderboardService.getLeadearboardById(id);
//        return leaderboard.map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping("")
//    public Leaderboard saveLeaderboard(@RequestBody Leaderboard leaderboard) {
//        return leaderboardService.saveLeaderboard(leaderboard);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteLeaderboard(@PathVariable Long id) {
//        leaderboardService.deleteLeaderboard(id);
//        return ResponseEntity.noContent().build();
//    }
//
//}
