package com.rsachin.cricketmatch.services;

import com.rsachin.cricketmatch.configurations.Constants;
import com.rsachin.cricketmatch.models.Match;
import com.rsachin.cricketmatch.models.Team;
import com.rsachin.cricketmatch.models.TossDetails;
import com.rsachin.cricketmatch.repository.MatchRepository;
import com.rsachin.cricketmatch.repository.TeamRepository;
import com.rsachin.cricketmatch.repository.TossRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TossServiceImpl implements TossService{
    @Autowired
    private TossRepository tossRepository;
    @Autowired
    private MatchRepository matchRepository;
    @Autowired
    private TeamRepository teamRepository;
    @Override
    public TossDetails startToss(String matchId) {
        TossDetails td=new TossDetails();
        td.setMatchId(matchId);
        // fetch teams from matchId
        Optional<Match> matchOp = matchRepository.findById(matchId);
        if(matchOp.isPresent()){
            String teamA=matchOp.get().getTeamAId();
            String teamB = matchOp.get().getTeamBId();
            td.setTeamWhoTookTheCall(teamA);
            td.setCallersChoice(Constants.HEADS);
            if(getTossOutcome()==0){
                td.setTossOutcome(Constants.HEADS);
                td.setTeamWhoWillBat(teamA);
                td.setTeamWhoWonTheToss(teamA);
                td.setTeamWhoWillBowl(teamB);

            }else{
                td.setTossOutcome(Constants.TAILS);
                td.setTeamWhoWillBat(teamB);
                td.setTeamWhoWonTheToss(teamB);
                td.setTeamWhoWillBowl(teamA);
            }
        }
        tossRepository.save(td);
        return td;
    }

    @Override
    public TossDetails getTossDetailsForMatch(String matchId) {
        Optional<TossDetails> tdOp = tossRepository.findByMatchId(matchId);
        if(tdOp.isPresent()){
            TossDetails td=tdOp.get();
            Optional<Team> tA = teamRepository.findById(td.getTeamWhoTookTheCall());
            Optional<Team> tB = teamRepository.findById(td.getTeamWhoTookTheCall().equals(td.getTeamWhoWillBat())?td.getTeamWhoWillBowl():td.getTeamWhoWillBat());
            td.setTeamWhoTookTheCall(tA.get().getTeamName());
            // TODO : complete toss details function
            return td;
        }
        return new TossDetails();
    }

    private int getTossOutcome(){
        return (int)Math.floor(Math.random() * (1 - 0 + 1) + 0);
    }
}
