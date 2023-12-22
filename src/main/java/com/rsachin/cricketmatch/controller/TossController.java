package com.rsachin.cricketmatch.controller;

import com.rsachin.cricketmatch.models.TossDetails;
import com.rsachin.cricketmatch.services.TossService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TossController {
    @Autowired
    private TossService tossService;

    @PostMapping("/match/{matchId}/start-toss")
    public TossDetails startToss(@PathVariable String matchId){
        // start toss between the two teams inside matchId
        TossDetails td=tossService.startToss(matchId);
        return td;
    }
    @GetMapping("/matches/{matchId}/toss-details")
    public TossDetails getTossDetails(@PathVariable String matchId){
        return tossService.getTossDetailsForMatch(matchId);
    }
}
