package com.bmpl.array;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
	//	int val[5];
		
		Integer values[] = new Integer[5];
		// 0-4 index
		Scanner scanner = new Scanner(System.in);

		// initialization in array
		Integer data[] = {43, 687, 32, 87};
		
		System.out.println("Enter 5 values in Array");
		for(int i = 0; i<values.length; i++){
			values[i] = scanner.nextInt();
		}
		
		for(int i = 0; i<values.length; i++){
			System.out.println("value at [" + i + "]" + " index is = " + values[i]);
		}
		
//		System.out.println("Your entered array elements are:");
//		for(int i : values){
//			System.out.println(i);
//		}
		
	}

}
