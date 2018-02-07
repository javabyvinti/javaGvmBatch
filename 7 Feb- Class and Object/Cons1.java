package com.bmpl.javabasic;

import java.util.Scanner;

public class Cons1 {

	int value1;
	int value2;
	int value3;
	
	void input(){
		
		Scanner scanner = new Scanner(System.in);
		
		value1 = scanner.nextInt();
		
		value2 = scanner.nextInt();
			
	}
			// Formal Arguments
	int sum(){
		
		return value1 + value2;
		//System.out.println(value1 + value2);
	}
	
	int sumOfThree(){
		return value1 + value2 + value3;
	}
	
	
	public static void main(String[] args) {
		Cons1 cons = new Cons1();
		
		cons.input();
		System.out.println(cons.sum());
		System.out.println(cons.sumOfThree());
	}

}
