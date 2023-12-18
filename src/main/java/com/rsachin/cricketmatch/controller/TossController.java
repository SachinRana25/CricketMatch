package com.rsachin.cricketmatch.controller;

import com.rsachin.cricketmatch.models.TossDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TossController {
    @PostMapping("/match/{matchId}/start-toss")
    public String startToss(@PathVariable String matchId){
        return "TOSS STARTED";
    }
    @GetMapping("/matches/{matchId}/toss-details")
    public TossDetails getTossDetails(@PathVariable String matchId){

    }
}
