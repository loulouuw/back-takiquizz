//package com.takima.backskeleton.controllers;
//
//import com.takima.backskeleton.models.Duel;
//import com.takima.backskeleton.services.DuelService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/duels")
//public class DuelControler {
//
//    private DuelService duelService;
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Duel> getDuelById(@PathVariable Long id) {
//        Optional<Duel> duel = duelService.getDuelById(id);
//        return duel.map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping("")
//    public Duel saveDuel(@RequestBody Duel duel) {
//        return duelService.saveDuel(duel);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteDuel(@PathVariable Long id) {
//        duelService.deleteDuel(id);
//        return ResponseEntity.noContent().build();
//    }
//
//}
