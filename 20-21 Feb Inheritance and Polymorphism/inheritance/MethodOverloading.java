package com.bmpl.inheritance;

public class MethodOverloading {

	//int value, value;
	
	void add(int value1, int value2){
		System.out.println(value1+value2);
	}
	
	
	void add(int value1, int value2, int value3){
		System.out.println(value1 + value2 + value3);
	}
	
	
	long add(long value1, long value2){
		return value1 + value2;
	}
	
	
	float add(float value1, float value2, float value3, float value4){
		return value1+value2+value3+value4;
	}
	
	public static void main(String[] args) {
		
		MethodOverloading overload = new MethodOverloading();
		System.out.println(overload.add(89, 10, 43, 32));
		System.out.println(overload.add(600000888l, 4343434));
		overload.add(12,  67);
	}

}
