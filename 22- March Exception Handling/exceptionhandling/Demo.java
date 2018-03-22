package com.bmpl.exceptionhandling;

public class Demo {

	public static void main(String[] args) {
		try{
			int array[]  = new int[10];
			
			//array[20] = 12;
			int i = 0;
			while(i<10){
				System.out.println(i);
			}
			
			//System.out.println(array[12]);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.exit(0); // 
			//return;
		}
		finally{
			System.out.println("Finally executed");
		}
		

	}

}
