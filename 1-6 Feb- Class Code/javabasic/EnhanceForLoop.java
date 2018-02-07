package com.bmpl.javabasic;

public class EnhanceForLoop {

	public static void main(String[] args) {
		// Java 1.5 version
		
		String name[] = {"ram","aman", "mohan"};
		
		int array[] = {32, 32, 554, 32, 554, 32, 554, 554};
		
		System.out.println("Array length is = " + array.length);
				//20<20
//		for(int i = 0; i< array.length; i++){
//			System.out.println(array[i]);
//		}

		//Traverse array elements
		for(int val : array){//array[1]-->32
			System.out.println(val);
		}
		
	}

}
