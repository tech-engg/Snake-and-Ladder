package com.snakeladder;

import java.lang.Math;

public class SnakeLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String[] args) {
		System.out.println("Snake and Ladder");

		int position = 0;
		int newPosition = 0;

		int rollDie = (int) (Math.random() * 6) + 1;
		int check = (int) (Math.random() * 3);

		switch (check) {
		case NO_PLAY:
			newPosition = 0;
			break;
		case LADDER:
			newPosition = +rollDie;
			break;
		case SNAKE:
			newPosition = -rollDie;
			break;
		}
		position = position+newPosition;
		if(position<0) {
			 position = 0; 
		}
		System.out.println("you at" + position +"th"+"position");
	}

}