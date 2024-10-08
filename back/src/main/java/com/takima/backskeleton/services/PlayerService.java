package com.takima.backskeleton.services;

import com.takima.backskeleton.models.Player;
import com.takima.backskeleton.DAO.PlayerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {

    @Autowired
    private PlayerDao playerDao;

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
    public List<Player> findByEmail(String email) {
        return playerDao.findByEmail(email);
    }

    // Trouver des joueurs avec plus de points
    public List<Player> findPlayersWithMoreThanXPoints(int points) {
        return playerDao.findByTotalPointsGreaterThan(points);
    }

    // Trouver des joueurs avec un nombre spécifique de victoires en duel
    public List<Player> findPlayersWithDuelVictories(int victories) {
        return playerDao.findByDuelVictories(victories);
    }
}
