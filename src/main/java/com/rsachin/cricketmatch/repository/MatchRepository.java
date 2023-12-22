package com.rsachin.cricketmatch.repository;

import com.rsachin.cricketmatch.models.Match;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatchRepository extends MongoRepository<Match,String> {
}
