package com.bmpl.javabasic;

public class Pattern4{

	/*
			*		*********
		   ***		 *******
          *****		  *****
         *******	   ***
        *********	    *
	 */
	
	public static void main(String[] args) {
		
		for(int row = 1; row<=5; row++){//3<=5
			
			for(int space = 1; space <=row; space++){
				System.out.print(" ");
			}						  
			
			for(int column = 9; column>=(2*row-1); column--){//9>=5 //98765
				System.out.print("*");
			}
			System.out.println();
		}
		
		
//		for(int row = 1; row<=5; row++){//3<=5
//					
//					for(int space = 5; space >=row; space--){
//						System.out.print(" ");
//					}						  
//					
//					for(int column = 1; column<=(2*row-1); column++){//1<=5
//						System.out.print("*");
//					}
//					System.out.println();
//				}
			
	}

}
