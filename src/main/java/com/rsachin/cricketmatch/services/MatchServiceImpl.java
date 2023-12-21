package com.rsachin.cricketmatch.services;

import com.rsachin.cricketmatch.configurations.Constants;
import com.rsachin.cricketmatch.models.Match;
import com.rsachin.cricketmatch.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl implements MatchService{
    @Autowired
    private MatchRepository matchRepository;
    @Override
    public String createMatch(String teamAId, String teamBId) {
        Match match=new Match();
        match.setOvers(Constants.MATCH_OVERS);
        match.setTeamAId(teamAId);
        match.setTeamBId(teamBId);
        return matchRepository.save(match).getMatchId();
    }
}
