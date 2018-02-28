package com.bmpl.interfacedemo;
// class to class --> extends
// interface to interface --> extends
// class and interface --> implements 


public abstract interface Game{
// 100% abstract --> internally 
	
	int value = 12;
	int MAXLIFE = 5;
	public final int MINLIFE = 1;
	
	public abstract void power();
	void attack();
	void jump();
	void displayScore();
	
	// java 1.8 --> interfaces are not 100% abstract
	// default keyword functionality into our method inside interface
	default void play(){
		
	}
	
	static void pause(){
		
	}
}
