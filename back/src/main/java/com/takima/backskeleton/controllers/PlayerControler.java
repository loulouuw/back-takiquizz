package com.takima.backskeleton.controllers;


import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.models.dto.LoginInputDto;
import com.takima.backskeleton.models.dto.LoginResponseDto;
import com.takima.backskeleton.models.dto.RegisterInputDto;
import com.takima.backskeleton.services.PlayerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
@CrossOrigin(origins = "http://localhost:4200")
public class PlayerControler {

    private PlayerService playerService;

    public PlayerControler(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> getPlayerById(@PathVariable Long id) {
        return playerService.getPlayerById(id)
                .map(player -> ResponseEntity.ok().body(player))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("")
    public Player savePlayer(@RequestBody Player player) {
        return playerService.savePlayer(player);
    }

    @GetMapping("")
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlayer(@PathVariable Long id) {
        playerService.deletePlayer(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<Player> findByUsername(@PathVariable String username) {
        return playerService.findByUsername(username)
                .map(player -> ResponseEntity.ok().body(player))
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/email/{email}")
    public Player findByEmail(@PathVariable String email) {
        return playerService.findByEmail(email);
    }

    @GetMapping("/points/{points}")
    public List<Player> findPlayersWithMoreThanXPoints(@PathVariable int points) {
        return playerService.findPlayersWithMoreThanXPoints(points);
    }
    @PostMapping("/register")
    public ResponseEntity<String> registerPlayer(@RequestBody RegisterInputDto registerDTO) {
        try {
            playerService.registerPlayer(registerDTO);
            return ResponseEntity.status(201).body("Joueur enregistré avec succès.");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(400).body(e.getMessage());
        }
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDto> loginPlayer(@RequestBody LoginInputDto loginDTO) {
        try {
            Player player = playerService.authenticatePlayer(loginDTO);
            return ResponseEntity.ok(new LoginResponseDto("Connexion réussie", player.getId()));
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(401).body(new LoginResponseDto(e.getMessage(),0));
        }
    }



}
