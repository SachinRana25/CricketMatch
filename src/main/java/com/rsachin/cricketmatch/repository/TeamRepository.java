package com.rsachin.cricketmatch.repository;

import com.rsachin.cricketmatch.models.Team;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends MongoRepository<Team,String> {
}
