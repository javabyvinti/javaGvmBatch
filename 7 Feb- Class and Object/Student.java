package com.bmpl.javabasic;

// instance variables

// Parent class or Root class --> Object
// Root--> Object class

public class Student{

	// state of a class
	// scope class level
	int value;	// instance variable
	String name;	// assigned a default value
	// access throughout class
	
	// outside of any function or outside any constructor or outside any block, etc
	// inside class
	public static void main(String[] args) {
		
		// throughout function --> scope
		int val = 0;	
		// Local variable --> inside the function or inside the constructor or 
		//inside the block
		
		System.out.println("Local variable = " +val);// local variable --> function --> no default value

		// intermediator
		Student student = new Student();
		
		//1 way --> declare that static
		student.print();
		System.out.println("Instance variable = " +student.name);
		
	}
	// behaviour
	void print(){
		//val = 10;
		value = 90;
		System.out.println("Value is = " + value);
	}
}
