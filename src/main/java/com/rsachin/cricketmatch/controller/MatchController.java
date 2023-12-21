package com.rsachin.cricketmatch.controller;

import com.rsachin.cricketmatch.services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatchController {
    @Autowired
    private MatchService matchService;
    @PostMapping("/create-match/{teamA}/{teamB}")
    public String createMatch(@PathVariable String teamA,@PathVariable String teamB){
        // takes two team ids and create match between them
        return matchService.createMatch(teamA,teamB);
    }
}
