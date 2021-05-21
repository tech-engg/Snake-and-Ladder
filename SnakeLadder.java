package com.snakeladder;

import java.lang.Math;
public class SnakeLadder {

	public static void main(String[] args) {
		System.out.println("Snake and Ladder");
		
		int startPositon =0;
		
		int  rollDie = (int) (Math.random()*6)+1;
		
		System.out.println("Die Roll "  +rollDie);
	}

}
