package com.rsachin.cricketmatch.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("toss")
public class TossDetails {
    private String matchId;
    private String teamWhoWonTheToss;
    private String teamWhoTookTheCall;
    private String teamWhoWillBat;
    private String teamWhoWillBowl;
    private String tossOutcome;
    private String callersChoice;
}
