package com.learning.games;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
//Object creation of Games
//var Game = new MarioGame();
//var Game = new SuperContraGame();
//var Game = new PacManGame();	
	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}

//Object creation of GameRunner + Wiring the dependency (Game)
//Injecting Game dependency in GameRunner class
//var GameRunner = new GameRunner(Game);
//GameRunner.run();

	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
}
