package com.bmpl.inheritance;

class Animal{
	
	int health = 5;
	
	void eat(){
		System.out.println("Eat of Animal");
	}
	void animalData(){
		System.out.println("Animal data");
	}
}

class Mammal extends Animal{
	
	int health = 10;
}

class Dog extends Mammal{
	
	Animal a = new Animal();
	int health = 15;
	
	void eat(){
		System.out.println("Eat of Dog");
	}
	
	void dogData(){
		System.out.println("Dog data");
	}
	
	void displayHealth(int health){
		// health = local variable + class instance variable + 
		//	parent class instance variable + grandparent instance variable;
	
		health = health + this.health + super.health + a.health;
		System.out.println(health);
	}
}

public class UpcastingDowncasting {

	public static void main(String[] args) {
		//Upcasting and Downcasting --> Inheritance

		Dog d = new Dog();
		d.displayHealth(5);
		
		// Scope of an Object
		//Dog dog = new Dog();
//		Animal dog = new Dog(); // upcasting --> internally 
//		// upcasting is an implicit process or done automatically
//		Dog d = (Dog)dog; // downcasting
//		dog.eat();
//		d.dogData();

//		Dog d = new Dog();	
//		System.out.println(d.toString());// Object --> 
//		
//		Animal a = d;
//		System.out.println(a.toString());
//		System.out.println(d instanceof Dog);
	}

}
