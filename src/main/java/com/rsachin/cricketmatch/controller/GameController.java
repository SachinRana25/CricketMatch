package com.rsachin.cricketmatch.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @GetMapping("/test")
    public String test(){
        return "TEST";
    }
}
