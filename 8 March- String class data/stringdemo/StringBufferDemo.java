package com.bmpl.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		sb.append(" Java");
		
		System.out.println(sb);
		
		// Hello Java
		
		//sb.delete(2, 5);
		//System.out.println(sb);
					
		System.out.println(sb.insert(2, "world"));
		
	}
}
