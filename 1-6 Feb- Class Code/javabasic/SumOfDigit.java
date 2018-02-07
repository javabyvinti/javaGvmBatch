package com.bmpl.javabasic;

import java.util.Scanner;

public class SumOfDigit {

	// 125--> 1 + 2 + 5 = 8
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		int userNumber = Integer.parseInt(args[0]);
//		
//		int userNumber2 = Integer.parseInt(args[1]);
//		
//		System.out.println(userNumber);
//		System.out.println(userNumber2);

		System.out.println("Enter a number");
		
		int userNumber = scanner.nextInt();	//123 --> variable --> i + 1
										// 1 + 2 = 3 + 3 // sum
		int rem = 0, sum = 0;
		while(userNumber>0)
		{	// .5>0 
			rem = userNumber % 10;	// 12 % 10 --> 2
			sum = sum + rem;	// 5 + 1 = 6
			userNumber = userNumber / 10;	// 1 / 10 --> .5
		}
		System.out.println("Sum of Digit is = " + sum);
		
	}
}