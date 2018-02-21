package com.bmpl.inheritance;


class GrandParent{
	
	int value;
	
	//final int age = 90;
	/*final*/ 
	//access level --> private, public, protected, default(package access)
	 void print(){	// this method cannot be overridden
		int value;
		//age = 12;
		System.out.println(this.value);
		//System.out.println(value);
		System.out.println("print of GrandParent");
	}
	
}

class Parent extends GrandParent{
	
	@Override
	public void print(){
		System.out.println("print of Parent");
	}
	
}

class Child extends Parent{
	
	public void print(){
		
	}
	
}


public class FinalClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
