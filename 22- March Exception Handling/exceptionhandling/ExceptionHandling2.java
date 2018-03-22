package com.bmpl.exceptionhandling;

public class ExceptionHandling2 {

	int value = 10;
	//static ExceptionHandling2 obj; // reference variable
	String name;	// reference variable
	
	public static void main(String[] args) {
		// Exception Handling tools --> try and catch
		try{
			ExceptionHandling2 obj = null /*= new ExceptionHandling2()*/;
			System.out.println(obj.value);
			
		}
		catch(NullPointerException e){
			System.out.println("You forget to initialize some data");
		}
		catch(Exception ref){
			System.out.println();
		}
//		int data; // local variable
//		System.out.println(data);
		String name = null;
		System.out.println(name);
	}

}
