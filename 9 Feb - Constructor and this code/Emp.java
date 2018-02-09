package com.bmpl.javabasic;

public class Emp {

	String name;
	int empId;
	// this keyword--> always points to the current class members
	// instance variables or methods or consturctors
	
	void inputDetails(String name, int empId){
		this.name = name;	// local variable and global variable --> name
		this.empId = empId; // local variable name is same and instance variable name is same --> then use this keyword
	}
	
	
	void outputDetails(){
		System.out.println("Name is = "+name);
		System.out.println("EmpId is = "+empId);
	}
	
	
	
	public static void main(String[] args) {
		
		Emp emp = new Emp();
		emp.inputDetails("Ram", 1001);
		emp.outputDetails();
		

		emp.inputDetails("Mohan", 1002);
		emp.outputDetails();
		

		emp.inputDetails("Rohan", 1003);
		emp.outputDetails();

	}

}
