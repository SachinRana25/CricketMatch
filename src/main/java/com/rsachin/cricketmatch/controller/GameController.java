package com.rsachin.cricketmatch.controller;

import com.rsachin.cricketmatch.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping("/start-game/{matchId}")
    public String startGame(@PathVariable String matchId){
        // TODO : play match and return the winner team name
        String winner=gameService.startPlayingGame(matchId);
        return winner==null?"Hello":winner;
    }
}
