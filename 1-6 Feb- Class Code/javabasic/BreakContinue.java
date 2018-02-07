package com.bmpl.javabasic;

public class BreakContinue {

	public static void main(String[] args) {
		
		//outer loop
		for(int k = 1; k<=5; k++){
			//inner loop
			for(int i = 1; i<=10; i++){
				if(i==5){
					//continue;	// skip the current iteration
					break;	// terminate the current iteration/loop
					
				}else{
					System.out.println(i);//1
				}
			}
		}
		System.out.println("Exited from Loop");

	}

}
