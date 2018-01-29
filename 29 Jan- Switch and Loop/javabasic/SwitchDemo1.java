package com.bmpl.javabasic;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a character");
		
		// 
		
		char userValue = scanner.next().toLowerCase().charAt(0);// string break into indiviual chars

		// char name[20] --> 0 - 19
		
		//if(userValue == 'a' || userValue == 'e' || )

		
		
		switch(userValue){
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
		break;
		default:
			System.out.println("consonant");			
		break;
		
		
		

		}
		
		
		

	}

}
