package com.bmpl.stringdemo;

import java.util.Scanner;

//program to count the number of words in a string
public class WordsCount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a line");
		// This is my data
		String userValue = scanner.nextLine();
		
		
		// String --> split
		
		String[] data = userValue.split(" ");
		// ram kumar
		System.out.println("Total No. of Words are=" + data.length);
		
		char properCase;
		
		for(String d: data){
			// String.valueOf()
			properCase = d.toUpperCase().charAt(0); // char --> r
			System.out.print(d.replace(d.charAt(0), properCase) + " ");
		
			//System.out.println(d);
		}
		
		String name = "Mohan";
		name = name.replace('M', 'R');
		System.out.println(name);
	}

}
