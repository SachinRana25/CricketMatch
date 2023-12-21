package com.rsachin.cricketmatch.services;

import com.rsachin.cricketmatch.models.Player;

import java.util.List;

public interface PlayerService {
    Player addPlayer(Player player);
    String addAllPlayers(List<Player> players);
    Player getPlayerById(String id);
    List<Player> getAllPlayers();
}
