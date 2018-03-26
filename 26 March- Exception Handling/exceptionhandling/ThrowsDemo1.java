package com.bmpl.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception{	// Custom Exception create
	
	int age;
	MyException(){}
	
	MyException(int age){
		this.age = age;
	}
	
	// Root class --> Object class
	
	@Override
	public String toString(){
		InputMismatchException e;
		return "You cannot vote";
	}
	
//	@Override
//	void data(){
//		
//	}
}

public class ThrowsDemo1 {

	public static void main(String[] args) /*throws MyException*/ {
//		ThrowsDemo1 obj = new ThrowsDemo1();
//		System.out.println(obj); // toString() --> Object class

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scanner.nextInt();
		
			//new MyException();
				// new object is created --> MyException --> compiler will assign name
			try {
				if(age<18){
					
				throw new MyException(age);
		
				}else{
					System.out.println("you can vote");
				}
				
			} catch (MyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // explicitly raise an excption
		
		
	}

}
