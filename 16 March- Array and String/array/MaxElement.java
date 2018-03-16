package com.bmpl.array;

import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter elements in array");
		Integer array[] = new Integer[5];
		
		
		for(int i = 0; i<array.length; i++){
			array[i] = scanner.nextInt();
		}
		// 21, 54, 32, 76, 43
		int max = array[0]; // 21
		int index = 0;
		
		for(int i = 1; i<array.length; i++){
			
			if(max<array[i]){ // 76<43
				max = array[i]; // 76
				index = i;
			}
		}
		
		System.out.println("Maximum value with index [" + index +  "] is = " +max);
		
	}

}
