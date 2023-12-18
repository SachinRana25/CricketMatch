package com.rsachin.cricketmatch.services;

import com.rsachin.cricketmatch.models.Player;
import com.rsachin.cricketmatch.models.Team;

import java.util.List;

public interface TeamService {
    // Takes in list of playerIds and forms a team
    Team createTeamWithPlayerIds(List<String> playerIds);

    Team addPlayerToTeam(String playerId, String teamId);

    List<Team> getAllTeams();

    Team getTeamById(String teamId);
}
