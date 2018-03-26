package com.bmpl.exceptionhandling;

public class Input {

	public static void main(String[] args) {
		// -t f 
		String s = "-";
		try{
		
			doMath(args[0]);
			s+="t"; // -t
		}
		finally
		{
			System.out.println(s+="f"); //-tf
		}
	
	}
	
	public static void doMath(String a){
		int y  = 7/ Integer.parseInt(a); // 7/0 --> ArithmeticException	
	}
}
