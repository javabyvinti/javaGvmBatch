package com.bmpl.filehandling;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		// Step-1: Create a file
		//string --> path of file
		
		
		//File dir = new File("E:\\FirstFolder\\SecondFolder\\ThirdFolder");
		
		File creatingFile = new File("E:\\FirstFolder\\SecondFolder\\ThirdFolder\\newfile.txt");
		
		try {		// boolean --> .
			System.out.println(creatingFile.getParentFile().mkdirs());
			System.out.println(creatingFile.createNewFile());	// single directory
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
