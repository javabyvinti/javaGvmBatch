package com.bmpl.filehandling;

import java.io.File;

public class FileList {

	public static void main(String[] args) {
		
		File file = new File("E:\\");
		
		//String filename[] = file.list();
		
		File filename[] = file.listFiles();
		
		for(File f : filename){
			System.out.println(f);
		}
		System.out.println("Total no of files are : "+ filename.length);
	}
}