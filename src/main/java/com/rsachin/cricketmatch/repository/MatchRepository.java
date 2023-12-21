package com.rsachin.cricketmatch.repository;

import com.rsachin.cricketmatch.models.Match;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MatchRepository extends MongoRepository<Match,String> {
}
