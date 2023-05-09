package com.learning.games;

public class GameRunner {
	private GamingConsole gameConsole; // Instance of GameConsole

	public GameRunner(GamingConsole gameConsole) {
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