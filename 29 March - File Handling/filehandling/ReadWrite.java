package com.bmpl.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {

	public static void main(String[] args) {
		
		File file = new File("E:\\File.txt");
		
		// Output
		try {
			// Bytes
			
			FileOutputStream fout = new FileOutputStream(file);
			
			String data = "Write this into my file";
			
			//byte b[] = data.getBytes();
			
			fout.write(data.getBytes());
		
			System.out.println("Data written");
		
			
			FileInputStream fin = new FileInputStream(file);
			
			int i = 0;
			
			//System.out.println((char)fin.read());
			
			while((i = fin.read())!=-1){
				System.out.print((char)i);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		

	}

}
