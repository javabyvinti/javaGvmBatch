package com.bmpl.javabasic;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int userValue = scanner.nextInt();
		
		int flag = 0;
		
		//2 to userValue-1 --> 	//2-4 
		for(int i = 2; i<=userValue-1; i++){// 5<=4
			if(userValue%i==0){//5%4 == 0
				//System.out.println("Not Prime");
				flag = 1;
				break;
				//return;
			}
		}
		//System.out.println("Prime");
		
		if(flag==0){
			System.out.println("Prime");
		}else{
			System.out.println("Not Prime");
		}
		
	}

}
