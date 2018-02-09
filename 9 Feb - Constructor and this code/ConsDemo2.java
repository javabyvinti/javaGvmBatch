package com.bmpl.javabasic;

public class ConsDemo2 {

	String name;
	int rollno;
	String universityName;
	float percentage;
	
	// default value assign in your instance variable
	
	// package level --> can be accessed
	ConsDemo2(){
		universityName = "IPU";
	}
	// constructor chaining --> one object needs to call more than one constructor at a time --> this keyword
	ConsDemo2(String name, int rollno){
		this(43.65f);	// default constructor
		this.name = name;
		this.rollno = rollno;
	}
	
	ConsDemo2(float percentage){
		this();
		this.percentage = percentage;
	}
	
//	void input(String name, int rollno){
//		this.name = name;
//		this.rollno = rollno;
//	}
//	
	void output(){
		System.out.println("University is = " + universityName);
		System.out.println("Name is = " + name);
		System.out.println("Rollno is = " + rollno);
		System.out.println("Percentage is = "+ percentage);
	}
	
	public static void main(String[] args) {
		
		ConsDemo2 ram = new ConsDemo2("Ram", 1);
		ConsDemo2 mohan = new ConsDemo2("Mohan", 2);
		//consDemo2.input("Ram", 1);
		ram.output();
		mohan.output();
	}

}
