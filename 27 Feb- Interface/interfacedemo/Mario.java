package com.bmpl.interfacedemo;

// inherit --> interface
// class inherit --> class to class--> extends -->
// interface inherit -->interface to class --> implments

public class Mario implements Game,ScoreCard{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void power() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		//MAXLIFE--;
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scoreBoard() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int displayScore(int score) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void displayScore() {
		// TODO Auto-generated method stub
		
	}
}