package com.bmpl.javabasic;

public class Pattern5 {

	/*
	 
	 *
	 ***
	 *****
	 ***
	 *
	 
	*/
	
	public static void main(String[] args) {
		
		for(int row = 1; row<=3; row++)
		{
			for(int column = 1; column<=(2*row-1); column++){
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int row = 1; row<=2; row++){//2
			for(int column = 3; column>= (2*row-1); column--){
				System.out.print("*");
			}
			System.out.println();
		}
		

	}
}