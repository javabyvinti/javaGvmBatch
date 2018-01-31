package com.bmpl.javabasic;

public class Pattern3 {

	/*
	       *
	      **
	     *** 
	    ****
	   *****
	   
	 */
	
	public static void main(String[] args) {
		
		for(int row = 1; row<=5; row++){//3<=5
			
			for(int space = 5; space >=row; space--){
				System.out.print(" ");
			}						  
			
			for(int column = 1; column<=row; column++){//1<=1
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
