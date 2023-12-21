package com.rsachin.cricketmatch.controller;

import com.rsachin.cricketmatch.models.Player;
import com.rsachin.cricketmatch.models.PlayerStats;
import com.rsachin.cricketmatch.models.PlayerType;
import com.rsachin.cricketmatch.repository.PlayerRepository;
import com.rsachin.cricketmatch.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @PostMapping("/add-player")
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }

    @PostMapping("/add-all-players")
    public ResponseEntity<String> addAllPlayers(@RequestBody List<Player> players){
        return ResponseEntity.status(201).body(playerService.addAllPlayers(players));
    }
}
