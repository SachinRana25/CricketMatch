package com.rsachin.cricketmatch.services;

import com.rsachin.cricketmatch.models.Player;
import com.rsachin.cricketmatch.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceImpl implements PlayerService{
    @Autowired
    private PlayerRepository playerRepository;

    @Override
    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    @Override
    public String addAllPlayers(List<Player> players) {
        players.stream().forEach(p->addPlayer(p));
        return "Players Added";
    }


    @Override
    public Player getPlayerById(String id) {
        return null;
    }

    @Override
    public List<Player> getAllPlayers() {
        return null;
    }
}
