package com.bmpl.javabasic;

public class Pattern2 {

	/*
	1			A
	12			AB
	123			ABC
	1234		ABCD
	12345		ABCDE
	
	 */
	
	public static void main(String[] args) {
//		for(int row = 1; row <= 5; row++)//6<=5
//		{
//			for(int column = 1; column <= row; column++)//3<=2
//			{
//				System.out.print(row);	//1		
//			}							 	//12
//			System.out.println();			//
//		}							

		for(char row = 'A'; row <= 'E'; row++)//6<=5
		{
			for(char column = 'A'; column <= row; column++)//3<=2
			{
				System.out.print(column);	//1		
			}							 	//12
			System.out.println();			//
		}							
		

		System.out.println('a' + 1);
		System.out.println("a" + 1);
	}

}
