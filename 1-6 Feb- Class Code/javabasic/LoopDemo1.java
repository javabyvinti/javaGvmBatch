package com.bmpl.javabasic;

import java.util.Scanner;

public class LoopDemo1 {

	// Input from user and print the table of that number -->
	// 2 X 1 = 2
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int userNumber = scanner.nextInt();
		int temp = 1;

		for(int i = 1; i<=10; i++){
			temp = userNumber * i;
			System.out.println(userNumber + " X " + i + " = " + temp);
			
		}
		
		
	}

}
