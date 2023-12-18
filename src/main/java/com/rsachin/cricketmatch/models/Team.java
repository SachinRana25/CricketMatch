package com.rsachin.cricketmatch.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;
@Data
@Document("teams")
public class Team {
    @Id
    private String teamId;
    private String teamName;
    private Player captain;
    private List<Player> players = new ArrayList<>();
}
