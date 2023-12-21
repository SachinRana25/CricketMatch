package com.rsachin.cricketmatch.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("match")
@Data
public class Match {
    @Id
    private String matchId;
    private String teamAId;
    private String teamBId;
    private int overs;
}
