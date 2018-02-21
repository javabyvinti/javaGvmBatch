package com.bmpl.inheritance;


class A1{

	String data1;
	
	void print(){
		System.out.println("Print of A class");
	}
	
	
	void data(){
		System.out.println("Data of A class");
	}
	
	
	void details(){
		System.out.println("Details of A class");
	}
	
	
	void calc(){
		System.out.println("Calc of A class");
	}
	
	
	void input(){
		System.out.println("Input of A class");
	}
	
}


class B1 extends A1{
// print() --> modify
	// Annotations --> @annotation

	
	
	
		void bData(){
		
	
		}

		@Override
		void data() {
			super.data();// parent features + new features
			//.....
		}
		// guptaekta11@gmail.com

		@Override
		void input() {
			// TODO Auto-generated method stub
			super.input();
		}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		B1 b1 = new B1();
		b1.data();

	}

}
