package com.bmpl.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsDemo {

	int value1, value2, result;
	
	void input() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first value");
		value1 = sc.nextInt();
		
		System.out.println("Enter your second value");
		value2 = sc.nextInt();
	}
	
	void calculate() throws ArithmeticException{
		//try{
		this.input();
		result = value1/value2;
//		}catch(Exception e){
//			System.out.println("Some Exception occured");
//		}
		
		
	}
	
	void print() throws Exception{
		calculate();
		System.out.println("Result is = " +result); 
		
	}
	
	
	public static void main(String[] args) throws Exception {
		ThrowsDemo obj = new ThrowsDemo();
		obj.print();
		
		
		//obj.input();
		//obj.calculate();
//		try {
//			obj.print();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Exceptin occured and handled");
//		}	// 

	}

}
