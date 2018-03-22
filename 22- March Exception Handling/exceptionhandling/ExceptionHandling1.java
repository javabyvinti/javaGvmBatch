package com.bmpl.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling1 {
						// hey
	public static void main(String[] args) {
		
//		int array[] = {};	// syntax error
//		System.out.println(array[2]);
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter first value");
		
		try{
		
		int value1 = scanner.nextInt();
		
		System.out.println("Enter second value");
		
		int value2 = scanner.nextInt();
		
		int result = value1/value2;
		
		System.out.println("Division result is = " +result);
		
		int data = Integer.parseInt("10");
		System.out.println(data);
		
		}
		catch(ArithmeticException e){
			System.out.println("Division by zero");
		}
		catch(NumberFormatException e){
			System.out.println("Only numbers between [0-9] are allowed");
		}
//		catch(Exception e){
//			System.out.println(e.getMessage());
//			System.out.println("Some Exception Occured");
//		}
		
	}

}
