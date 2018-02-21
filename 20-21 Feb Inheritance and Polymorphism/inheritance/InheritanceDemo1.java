package com.bmpl.inheritance;

class Person extends Object{
	
	String name; 
	String address;
	int idProof;
	
	void personInputDetails(){
		System.out.println("Person Input Details");
	}
	
}


class Student extends Person{
	
	String studName;
	int studRollno;
	String studAddress;
	
	
	void studentInputDetails(){
		System.out.println("Student Input Details");
	}
	
	void printDetails(){
		personInputDetails();
		System.out.println("Student Name = " + studName);
		System.out.println("Person name = "+name);
		
	}
}


class Employee extends Student{
	int empId;
	String empName;
	
	
	void employDetails(){
		
	}
}



public class InheritanceDemo1 {

	public static void main(String[] args) {
		Student aman = new Student();
		aman.printDetails();
		
		Employee emp = new Employee();
		emp.empId = 90;
		
	}

}
