// use Scanner --> user input --> console

import java.util.Scanner;


class Data{
	
	public static void main(String args[])
	{
		
	int value1, value2;
	
	Scanner scanner = new Scanner(System.in);// whenever an object 				//is created a constructor is called
	
	System.out.println("Enter your first value");
	// nextInt(), nextFloat(), nextDouble(), nextLong()
	// next() --> withoutspace, nextLine()-with spaces till '\n'

	// parseInt();	nextInt();// standard of declaring methods

	value1 = scanner.nextInt();	

	System.out.println("Enter your second value");

	value2 = scanner.nextInt();	
	
	int sum = value1 + value2;

	System.out.println("Sum is = " +sum);

	}

}
