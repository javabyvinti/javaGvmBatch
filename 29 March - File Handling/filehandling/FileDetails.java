package com.bmpl.filehandling;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDetails {

	public static void main(String[] args) {
		
		String filePath = "E:\\A\\B\\File.txt";
		
		File file = new File(filePath);
		try {
			
			file.getParentFile().mkdirs();
			file.createNewFile();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Is Directory = " +file.isDirectory());
		System.out.println("File exists = " + file.exists());
		System.out.println("Can Write =  " +file.canWrite());
		System.out.println("Can Read = " + file.canRead());
		System.out.println("Parent file = " + file.getParentFile());
		
		Date date = new Date(file.lastModified());
		
		System.out.println("File Last Modified = " + date);
		System.out.println("File name = " +file.getName());
		System.out.println("File path = " +file.getPath());
		System.out.println("File Parent = " +file.getParent());
		
	}

}
