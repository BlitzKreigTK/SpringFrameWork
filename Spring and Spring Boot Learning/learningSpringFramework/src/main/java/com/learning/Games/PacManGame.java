package com.learning.Games;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacManGameQualifier")
public class PacManGame implements GamingConsole {
	public void up() {
		System.out.println("Move Up");
	}

	public void down() {
		System.out.println("Move Down");
	}

	public void left() {
		System.out.println("Move Left");
	}

	public void right() {
		System.out.println("Move Right");
	}
}
