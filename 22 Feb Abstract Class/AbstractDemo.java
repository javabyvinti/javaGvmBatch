package com.bmpl.abstractdemo;

abstract class Shape{	// incomplete
	
	// declared but not initialized
	abstract void draw();	// standard maintain
	
	Shape(){
		System.out.println("Default of Shape class");
	}
}

abstract class Circle extends Shape{

	
	
}

class Circle1 extends Circle{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		
	}
	
}

class Rectangle extends Shape{
	void draw(){
		System.out.println("To draw a Rectangle on Screen");
	}
}


public class AbstractDemo {

	public static void main(String[] args) {
//		Circle circle =new Circle();
//		circle.draw();

		//Shape shape = new Shape();
		
	}

}
