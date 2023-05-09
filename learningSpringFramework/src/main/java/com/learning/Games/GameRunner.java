package com.learning.Games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	private GamingConsole gameConsole; // Instance of GameConsole

	public GameRunner(@Qualifier("PacManGameQualifier") GamingConsole gameConsole) {
		this.gameConsole = gameConsole;
	}

	public void run() {
		System.out.println(gameConsole);
		gameConsole.up();
		gameConsole.down();
		gameConsole.left();
		gameConsole.right();
	}
}