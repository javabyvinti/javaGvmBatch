package com.bmpl.javabasic;

import java.util.Scanner;

public class Reverse {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int userNumber = scanner.nextInt();
		
		int temp = 0;
		
		System.out.print("Reverse = ");
		
		while(userNumber>0){//1>0
			
			temp = userNumber % 10;//12 --> 1
			userNumber = userNumber / 10; // 1
			System.out.print(temp); // 321
		}
		

	}

}
