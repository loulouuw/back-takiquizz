//package com.takima.backskeleton.controllers;
//
//import com.takima.backskeleton.models.SurvivalMode;
//import com.takima.backskeleton.services.SurvivalModeService;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/survivalmodes")
//public class SurvivalModeControler {
//
//    private SurvivalModeService survivalModeService;
//
//    @GetMapping("/{id}")
//    public ResponseEntity<SurvivalMode> getSurvivalModeById(@PathVariable Long id) {
//        Optional<SurvivalMode> survivalMode = survivalModeService.getSurvivalModeById(id);
//        return survivalMode.map(ResponseEntity::ok)
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @PostMapping("")
//    public SurvivalMode saveSurvivalMode(@RequestBody SurvivalMode survivalMode) {
//        return survivalModeService.saveSurvivalMode(survivalMode);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteSurvivalMode(@PathVariable Long id) {
//        survivalModeService.deleteSurvivalMode(id);
//        return ResponseEntity.noContent().build();
//    }
//
//}
