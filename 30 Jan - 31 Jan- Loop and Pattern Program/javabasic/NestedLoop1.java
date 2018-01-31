package com.bmpl.javabasic;

public class NestedLoop1 {

	public static void main(String[] args) {
		
		for(int i = 1; i<=3; i++)// 4<=3
		{
			for(int j = 1; j<=3; j++){ // j=1<=3
				
				if(i!=j){
					System.out.println("value of i = " + i + " value of j = " + j);
						
				}
			}	
			//System.out.println();
		}
		

	}

}
