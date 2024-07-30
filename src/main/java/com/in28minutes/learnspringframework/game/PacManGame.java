package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class PacManGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Go up");
	}

	@Override
	public void down() {
		System.out.println("Duck your head");
	}

	@Override
	public void left() {
		System.out.println("Turn left");
	}

	@Override
	public void right() {
		System.out.println("Turn right");
	}

}
