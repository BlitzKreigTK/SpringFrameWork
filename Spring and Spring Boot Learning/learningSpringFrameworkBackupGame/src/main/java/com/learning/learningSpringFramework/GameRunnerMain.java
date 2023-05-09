package com.learning.learningSpringFramework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learning.games.GameRunner;
import com.learning.games.GamingConfiguration;
import com.learning.games.GamingConsole;

public class GameRunnerMain {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}

//		// Object creation of Games
//		// var Game = new MarioGame();
//		var Game = new SuperContraGame();
//		// var Game = new PacManGame();
//		// Object creation of GameRunner + Wiring the dependency (Game)
//		// Injecting Game dependency in GameRunner class
//		var GameRunner = new GameRunner(Game);
//		GameRunner.run();
	}
}