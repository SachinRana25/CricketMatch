package com.rsachin.cricketmatch.controller;

import com.rsachin.cricketmatch.models.Team;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    @GetMapping("/teams")
    public List<Team> getAllTeams(){
        return null;
    }

    @GetMapping("/teams/{teamId}")
    public Team getTeamById(@PathVariable int teamId){
        return null;
    }

    public Team createTeam(Team team){
        // TODO : create team with playerIds in array
        return team;

    }
}
