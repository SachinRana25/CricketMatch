package com.rsachin.cricketmatch.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document("players")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Player{
    @Id
    private String playerId;
    private String role;
    private String name;
    private PlayerStats stats=null;
}
