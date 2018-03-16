package com.bmpl.stringdemo;

public class StringDemo2 {

	public static void main(String[] args) {

		
		String name = "Ram";
		
		
		
		//System.out.println(name);
		
		name = "Ram Kumar";
		
		//System.out.println(name);
						// Ram Kumar --> 0 to <5
		//System.out.println(name.substring(0, 5));

		name = name.substring(0, 5);
		System.out.println(name);
		
		System.out.println(name);
	
	
		String firstName = "Rohan";
		String lastName = "Sharma";
		
		System.out.println(firstName.concat(" " +lastName));
	
		System.out.println(firstName.toLowerCase());
		System.out.println(firstName.toUpperCase());
		
		System.out.println(firstName.charAt(3));
		
		String line = "This is my line to be split";
		//Regular Expression
		String result[] = line.split("s");
		
		
		System.out.println(result.length);
		
		for(String s: result){
			System.out.println(s);
		}
		
		System.out.println(firstName.length());
		System.out.println(firstName.replace("o", "e"));
		// Rohan --> 0-> R, 1-> O, 2-> H
		System.out.println(firstName.substring(2, 3));
		
		String data = "              this is my data        new data ";
		System.out.println(data.trim() + "Data");
		
		System.out.println(firstName.indexOf("n"));
	
		String d = "hello";
		System.out.println(d.indexOf("e"));
		
		System.out.println();
	}

}
