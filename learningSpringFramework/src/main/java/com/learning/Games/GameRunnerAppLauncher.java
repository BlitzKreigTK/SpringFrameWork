package com.learning.Games;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.learning.games")
public class GameRunnerAppLauncher {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(GameRunnerAppLauncher.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
	}
}