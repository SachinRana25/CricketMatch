package com.rsachin.cricketmatch.controller;

import com.rsachin.cricketmatch.models.Player;
import com.rsachin.cricketmatch.models.PlayerStats;
import com.rsachin.cricketmatch.models.PlayerType;
import com.rsachin.cricketmatch.repository.PlayerRepository;
import com.rsachin.cricketmatch.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @PostMapping("/add-player")
    public Player addPlayer(@RequestBody Player player){
        return playerService.addPlayer(player);
    }
}
