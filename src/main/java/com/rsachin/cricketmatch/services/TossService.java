package com.rsachin.cricketmatch.services;

import com.rsachin.cricketmatch.models.TossDetails;

public interface TossService {
    TossDetails startToss(String matchId);
    TossDetails getTossDetailsForMatch(String matchId);
}
