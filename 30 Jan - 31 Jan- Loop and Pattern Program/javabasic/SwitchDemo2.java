package com.bmpl.javabasic;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		//[1-7] ==> 3 ==> Wednesday
		// String
		
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter current day name");
		
		String day = scanner.next();
		
		switch(day){
		
		case "monday":
			System.out.println("2% discount");
			break;
		case "tuesday":
			System.out.println("3% discount");
			break;
			
		case "wednesday":
			System.out.println("4% discount");
			break;
		case "thursday":
			System.out.println("6% discount");
			break;
		}
		
	}

}
