package com.rsachin.cricketmatch.controller;

import com.rsachin.cricketmatch.models.CreateTeamResponse;
import com.rsachin.cricketmatch.models.Team;
import com.rsachin.cricketmatch.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    private TeamService teamService;
    @GetMapping("/teams")
    public List<Team> getAllTeams(){
        return null;
    }

    @GetMapping("/teams/{teamId}")
    public Team getTeamById(@PathVariable int teamId){
        return null;
    }

    @PostMapping("/teams/create-team")
    public CreateTeamResponse createTeam(){
        // TODO : create team with all available players in dastabase
        return teamService.createTeamWithAllPlayers();
        //return ResponseEntity.status(201).body("Team Created");

    }
}
