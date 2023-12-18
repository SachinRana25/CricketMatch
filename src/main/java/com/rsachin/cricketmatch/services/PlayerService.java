package com.rsachin.cricketmatch.services;

import com.rsachin.cricketmatch.models.Player;

import java.util.List;

public interface PlayerService {
    Player addPlayer(Player player);
    Player getPlayerById(String id);
    List<Player> getAllPlayers();
}
