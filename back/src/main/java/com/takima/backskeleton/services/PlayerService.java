package com.takima.backskeleton.services;

import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.DAO.PlayerDao;
import com.takima.backskeleton.models.dto.LoginInputDto;
import com.takima.backskeleton.models.dto.RegisterInputDto;
import com.takima.backskeleton.models.dto.RegisterInputDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    private PlayerDao playerDao;

    public PlayerService(PlayerDao playerDao) {
        this.playerDao = playerDao;
    }

    // Créer ou mettre à jour un joueur
    public Player savePlayer(Player player) {
        return playerDao.save(player);
    }

    // Obtenir tous les joueurs
    public List<Player> getAllPlayers() {
        return playerDao.findAll();
    }

    // Obtenir un joueur par ID
    public Optional<Player> getPlayerById(Long id) {
        return playerDao.findById(id);
    }

    // Supprimer un joueur par ID
    public void deletePlayer(Long id) {
        playerDao.deleteById(id);
    }

    // Trouver un joueur par nom d'utilisateur
    public Optional<Player> findByUsername(String username) {
        return Optional.ofNullable(playerDao.findByUsername(username));
    }

    // Trouver des joueurs par email
    public Player findByEmail(String email) {
        return playerDao.findByEmail(email);
    }

    // Trouver des joueurs avec plus de points
    public List<Player> findPlayersWithMoreThanXPoints(int points) {
        return playerDao.findByTotalPointsGreaterThan(points);
    }
    public void registerPlayer(RegisterInputDto registerDTO) {
        // Vérifiez si l'email ou le username existent déjà
        if (playerDao.existsByEmail(registerDTO.getEmail())) {
            throw new IllegalArgumentException("Email déjà utilisé.");
        }

        if (playerDao.existsByUsername(registerDTO.getUsername())) {
            throw new IllegalArgumentException("Nom d'utilisateur déjà utilisé.");
        }

        // Créez un nouvel utilisateur
        Player newPlayer = new Player();
        newPlayer.setUsername(registerDTO.getUsername());
        newPlayer.setEmail(registerDTO.getEmail());
        newPlayer.setMdp(registerDTO.getMdp());

        // Sauvegardez l'utilisateur
        playerDao.save(newPlayer);
    }
    public Player authenticatePlayer(LoginInputDto loginDTO) {
        // Recherchez le joueur par email
        Player player = playerDao.findByEmail(loginDTO.getEmail());
        if (player == null) {
            throw new IllegalArgumentException("Email ou mot de passe incorrect.");
        }

        // Vérifiez le mot de passe
        if (!loginDTO.getMdp().equals(player.getMdp())) {
            throw new IllegalArgumentException("Email ou mot de passe incorrect.");
        }

        return player;
    }



}
