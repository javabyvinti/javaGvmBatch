package com.bmpl.javabasic;

public class Constructor1 {

	// 1. constructor name must be same as of class name
	// 2. no return type is assigned with constructor
	// 3. whenever an object is created a constructor is called
	
	// default constructor
	Constructor1(){
		System.out.println("Default constructor is called");
	}
	
	// parameterized constructor
	 
	Constructor1(int value){// single parameterized cons
		System.out.println("Parameterized cons = " + value);
	}
	
	// double parameterized cons
	Constructor1(int value1, int value2){
		System.out.println("Parameterized cons = " + value1 + " " + value2);
	}
	
	Constructor1(String name){
		System.out.println("Parameterized cons = " + name);
	}
	
	public Constructor1(int i, String string) {
		System.out.println("Parameterized cons = " + i + string);
	}

	void Constructor1(){
		System.out.println("Data is called");
	}
	
	
	public static void main(String[] args) {
	
		// compiler automatically create a default con while creating object
		Constructor1 obj = new Constructor1(12, "Ram");

	}

}
