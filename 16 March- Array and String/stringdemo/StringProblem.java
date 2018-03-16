package com.bmpl.stringdemo;

public class StringProblem {

	public static void main(String[] args) {
		
		String user = "Space";
		
		for(int i = 1; i<=5; i++){
			
			// pace
			System.out.println(user.substring(1).concat(String.valueOf(user.charAt(0))));
			
			user = user.substring(1).concat(String.valueOf(user.charAt(0)));
			
		}
		

	}

}
