package com.bmpl.javabasic;

public class Pattern6 {

	/*
	
	*************
	****** ******
	*****   *****
	****     ****
	***       ***
	**         **
	*           * 
		
	 */
	
	public static void main(String[] args) {
	
		System.out.println("*************");
		for(int row=1; row<=6; row++)
		{
			for(int column = 6; column>=row; column--){
				System.out.print("*");
			}
			
			for(int space = 1; space<=(2*row-1); space++){
				System.out.print(" ");
			}
			
			for(int column = 6; column>=row; column--){
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
