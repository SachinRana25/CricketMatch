package com.rsachin.cricketmatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @GetMapping("/start-game/{matchId}")
    public String startGame(@PathVariable String matchId){
        // TODO : play match and return the winner team name
        return "Hello";
    }
}
