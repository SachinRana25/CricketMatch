package com.rsachin.cricketmatch.utility;

public class Utils {
    public static int pickRandom(int start, int end){
        return (int)Math.floor(Math.random() * (end - start + 1) + start);
    }
}
