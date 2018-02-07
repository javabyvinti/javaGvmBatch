package com.bmpl.javabasic;

public class ComplexPattern {

	/*
	A       A	// 7
	AB     BA   //5
	ABC   CBA   //3
	ABCD DCBA   //1
	 */
	
	public static void main(String[] args) {
		
		int temp = 7;
		
		for(char row = 'A'; row<='D'; row++){
			
			for(char column = 'A'; column<=row; column++)
			{
				System.out.print(column);
			}
			
			for(int space = 1; space<=temp; space++){
				System.out.print(" ");
			}
			
			for(char column = row; column>='A'; column--)
			{
				System.out.print(column);
			}
			
			temp -=2;
			System.out.println();
		}
		
		
	}

}
