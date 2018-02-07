package com.bmpl.javabasic;

public class Emp {

	String name;
	int empId;
	
	void inputDetails(String n, int e){
		name = n;	// local variable and global variable --> name
		empId = e;
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
