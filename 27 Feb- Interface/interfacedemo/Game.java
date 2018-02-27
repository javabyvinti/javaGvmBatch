package com.bmpl.interfacedemo;
// class to class --> extends
// interface to interface --> extends
// class and interface --> implements 


public interface Game {
// 100% abstract --> internally 
	
	int MAXLIFE = 5;
	public final int MINLIFE = 1;
	
	public abstract void power();
	void attack();
	void jump();
	void displayScore();
}
