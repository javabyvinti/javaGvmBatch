package com.bmpl.javabasic;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a value");
		
		int userNumber = scanner.nextInt();
		
		int sum = 0, rem = 0;
		int originalValue = userNumber;
		
		while(userNumber>0){// 0.5>0
			rem = userNumber % 10;	// 1 --> 1
			sum = sum + (rem*rem*rem);	// 36
			userNumber = userNumber / 10;	// 1 / 10 --> 0.5
		}
		
		if(originalValue == sum){
			System.out.println("Armstrong No. = " + sum);
		}else{
			System.out.println("Not an Armstrong No. = " + sum);
		}

	}

}
