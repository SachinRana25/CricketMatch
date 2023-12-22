package com.rsachin.cricketmatch.services;

import com.rsachin.cricketmatch.configurations.Constants;
import com.rsachin.cricketmatch.exceptions.InvalidGameException;
import com.rsachin.cricketmatch.models.*;
import com.rsachin.cricketmatch.repository.MatchRepository;
import com.rsachin.cricketmatch.repository.TeamRepository;
import com.rsachin.cricketmatch.repository.TossRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class GameServiceImpl implements GameService{
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private TossRepository tossRepository;
    @Autowired
    private TeamRepository teamRepository;

    private int score1=0,score2=0;
    private Team teamA=null,teamB=null;
    @Override
    public String startPlayingGame(String matchId) {
        // fetch the teams for this matchId
        Optional<Match> matchOptional = matchRepository.findById(matchId);
        if(matchOptional.isPresent()){
            Match match = matchOptional.get();
            // fetch the toss result of this match
            Optional<TossDetails> td_op= tossRepository.findByMatchId(matchId);
            if(td_op.isPresent()){
                // check who will Bat
                TossDetails td = td_op.get();
                // fetch teams
                Optional<Team> teama_op=teamRepository.findById(td.getTeamWhoWillBat());
                Optional<Team> teamb_op=teamRepository.findById(td.getTeamWhoWillBowl());
                if(teama_op.isPresent()){
                    teamA = teama_op.get();
                }else return "No Team with this TeamId exists "+td.getTeamWhoWillBat();
                if(teamb_op.isPresent()){
                    teamB=teamb_op.get();
                }else return "No Team with this TeamId exists "+td.getTeamWhoWillBowl();
                try {
                    playGame(teamA,teamB);
                } catch (InvalidGameException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("The Target is "+score1);
                try {
                    playGame(teamB,teamA);
                } catch (InvalidGameException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("The Second Team scored = "+score2);
            }else{
                return Constants.INVALID_TOSS;
            }
            return null;
        }
        return Constants.INVALID_MATCHID;
    }

    private void playGame(Team battingTeam, Team bowlingTeam)throws InvalidGameException {
        // get batsmen from batingTeam
        List<Player> batsmen = battingTeam.getPlayers().stream().filter(p->p.getRole().equals(PlayerType.BATSMAN)).collect(Collectors.toList());
        // get bowlers from bowling team
        List<Player> bowlers = bowlingTeam.getPlayers().stream().filter(p->p.getRole().equals(PlayerType.BOWLER)).collect(Collectors.toList());

        int bowls = Constants.MATCH_OVERS*6;

        // TODO : iterate number of bowls and call random functions until bowls==0 OR score2 reaches score1 OR wickets==batsmen.size()
    }
}
