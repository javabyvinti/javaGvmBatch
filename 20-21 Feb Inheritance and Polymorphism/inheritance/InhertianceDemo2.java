package com.bmpl.inheritance;

class A{
	A(){
		super();
		System.out.println("Default of class A");
	}
	A(int v){
		this();
		System.out.println("Default of class A");
	}
	
}


class B extends A{
	B(){
		super(5);
		System.out.println("Default of class B");
	}
}


class C extends B{
	
	C(){
		super();		// super
		System.out.println("Default of class C");
	}
}

public class InhertianceDemo2 {

	public static void main(String[] args) {
		C obj = new C();
	}
}