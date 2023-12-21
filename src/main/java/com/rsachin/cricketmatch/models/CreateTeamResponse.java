package com.rsachin.cricketmatch.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateTeamResponse {
    private String teamAId,teamBId;
}
