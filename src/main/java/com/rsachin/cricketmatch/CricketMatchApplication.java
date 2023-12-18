package com.rsachin.cricketmatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.rsachin.cricketmatch.repository")
public class CricketMatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketMatchApplication.class, args);
	}

}
