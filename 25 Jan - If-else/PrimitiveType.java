class PrimitiveType{

	public static void main(String args[])
	{
		//Primitive Type
		
		int value1 = 70, value2 = 70;

		//System.out.println(value1 == value2);			
		// Reference Type
		
		Integer first = new Integer(70);
		Integer second = new Integer(70);	
		
		String name1 = new String("Ram");
		String name2 = new String("ram");		


		// == is comparing address in reference type
		System.out.println(name1.equalsIgnoreCase(name2));

	}

}