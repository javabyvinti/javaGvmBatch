package com.bmpl.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyPasteFile {

	FileOutputStream fout;
	
	public static void main(String[] args) {
		
		// source
		File src = new File("D:\\image.jpg");

		// Destination
		File destination = new File("D:\\imageCopy.jpg");
		
		try {
			//FileOutputStream fout = new FileOutputStream(destination);
			FileInputStream fin = new FileInputStream(src);
			
			int i = 0;
			while((i = fin.read())!=-1){
				fout.write(i);
			}
			
			System.out.println("Data written");
			
			//FileReader fr = new FileReader(src);
		
			//FileWriter fw = new FileWriter(destination);
			
//			int i = 0;
//			
//			while((i = fr.read())!=-1){
//				fw.write(i);
//			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
