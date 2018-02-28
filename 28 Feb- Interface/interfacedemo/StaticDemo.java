package com.bmpl.interfacedemo;

public class StaticDemo implements Game,ScoreCard{

	//static int value;
	
	StaticDemo(){
//		value++;// 
//		System.out.println(value);
	}
	
	public static void main(String[] args) {
		
		StaticDemo s1 = new StaticDemo();
		StaticDemo s2 = new StaticDemo();
		StaticDemo s3 = new StaticDemo();
		System.out.println(Game.value);
		System.out.println(ScoreCard.value);
		System.out.println(Game.MAXLIFE);
		
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
	public void power() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayScore() {
		// TODO Auto-generated method stub
		
	}

}
