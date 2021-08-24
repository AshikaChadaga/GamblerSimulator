package com.bridgelabz.gamblersimulator;

public class GamblerSimulator {

	public static final double INITIAL_STAKE = 100;
	public static final double STAKE_BET = 1;
	public static int stake = 0;
	

	public static boolean winOrLose() {

		if ((int)Math.floor(Math.random()*10)%2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void gamblerDecision() {
		boolean resign = false;
		
		while(resign == false) {
			
			if (winOrLose()) {
				stake ++;
			} else {
				stake --;
			}
			if (stake >= INITIAL_STAKE + (INITIAL_STAKE * 0.5) || stake <= INITIAL_STAKE / 2) {
				resign = true;
			} 
			
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Gambler Simulation");
		gamblerDecision();
	}

}