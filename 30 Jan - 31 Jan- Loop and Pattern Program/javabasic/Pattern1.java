package com.bmpl.javabasic;

public class Pattern1 {

	/*
	 row and column
	 
	 12345	row = 1 to 5 or 0 to 4
	 12345 column = 1 to 5 or 0 to 4 
	 12345
	 12345
	 12345
	  
	  
	  
	  
	 */
	
	public static void main(String[] args) {

		for(int row = 1; row <= 5; row++){//1<=5
			for(int column = 1; column <= 5; column++){//1<=5
				System.out.print(row);//11111
									//  22222
			}							// 
			System.out.println();	
		}							
		
	}

}
