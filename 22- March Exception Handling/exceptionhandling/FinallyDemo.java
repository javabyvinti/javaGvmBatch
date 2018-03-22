package com.bmpl.exceptionhandling;

public class FinallyDemo {

	public static void main(String[] args) {
		
		int value1 = 54;
		int value2 = 10;
		
		
		try{
		
			int result = value1/value2;
			
			System.out.println(result);
				
		}
		/*catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}*/
		finally{
			System.out.println("Finally executed");
		}
		
	}// finally block --> i will execute either exception occur or not

}
