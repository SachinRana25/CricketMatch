package com.rsachin.cricketmatch.repository;

import com.rsachin.cricketmatch.models.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<Player,Long> {

}
