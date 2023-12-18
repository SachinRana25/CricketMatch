package com.rsachin.cricketmatch.models;

import lombok.Data;
import lombok.Getter;

@Data
public class PlayerStats {
    private int score=0;
    private int wickets=0;
    private int ballsFaced=0;
    private int runsGiven=0;

}
