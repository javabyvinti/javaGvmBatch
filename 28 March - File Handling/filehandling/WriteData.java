package com.bmpl.filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteData {

	public static void main(String[] args) throws IOException {
		
		String filePath = "E:\\File.txt";
		
		File file = new File(filePath);
		
		// txt 
		
		// FileWriter
		
		FileWriter fw = new FileWriter(file, true);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your data");
		String data = scanner.nextLine();
		
		//String data = "Write this into file";
		
		fw.write(data);
		System.out.println("Data written");
		fw.close();
		
		System.out.println("After Reading...");
		
		FileReader fr = new FileReader(file);
		
		int value;
		
		while((value = fr.read())!=-1)
		{
			System.out.print((char)value);	
		}	
	}
}