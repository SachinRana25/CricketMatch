package com.rsachin.cricketmatch.repository;

import com.rsachin.cricketmatch.models.TossDetails;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TossRepository extends MongoRepository<TossDetails,String> {
    Optional<TossDetails> findByMatchId(String matchId);
}
