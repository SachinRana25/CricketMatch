package com.rsachin.cricketmatch.services;

import com.rsachin.cricketmatch.models.CreateTeamResponse;
import com.rsachin.cricketmatch.models.Player;
import com.rsachin.cricketmatch.models.PlayerType;
import com.rsachin.cricketmatch.models.Team;
import com.rsachin.cricketmatch.repository.PlayerRepository;
import com.rsachin.cricketmatch.repository.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamServiceImpl implements TeamService{

    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public CreateTeamResponse createTeamWithAllPlayers() {
        List<Player> allPlayers = playerRepository.findAll();
        List<Player> batsmen=allPlayers.stream().filter(p->p.getRole().equals(PlayerType.BATSMAN)).collect(Collectors.toList());
        List<Player> bowlers=allPlayers.stream().filter(p->p.getRole().equals(PlayerType.BOWLER)).collect(Collectors.toList());

        Team teamA=new Team();
        Team teamB =new Team();
        teamA.setTeamName("TEAM A");
        teamB.setTeamName("TEAM B");
        for (int i = 0; i < batsmen.size() ; i++) {
            if(i<=batsmen.size()/2){
                teamA.getPlayers().add(batsmen.get(i));
                if(teamA.getCaptain()==null)teamA.setCaptain(batsmen.get(i));
            }else{
                teamB.getPlayers().add(batsmen.get(i));
                if(teamB.getCaptain()==null)teamB.setCaptain(batsmen.get(i));
            }
        }
        for (int i = 0; i < bowlers.size() ; i++) {
            if(i< bowlers.size()/2){
                teamA.getPlayers().add(bowlers.get(i));
            }else{
                teamB.getPlayers().add(bowlers.get(i));
            }
        }

        teamA=teamRepository.save(teamA);
        teamB=teamRepository.save(teamB);




        return new CreateTeamResponse(teamA.getTeamId(),teamB.getTeamId());
    }

    @Override
    public Team addPlayerToTeam(String playerId, String teamId) {
        return null;
    }

    @Override
    public List<Team> getAllTeams() {
        return null;
    }

    @Override
    public Team getTeamById(String teamId) {
        return null;
    }
}
