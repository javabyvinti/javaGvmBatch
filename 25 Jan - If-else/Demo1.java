class Demo1{
	
	public static void main(String args[])
	{
		String first = new String("Hello");
		String second = new String("Hello");
		String third = first;
		String fourth = second;

		System.out.println(first==third);
		System.out.println(second==fourth);	

	}

	void print(){
	//body
}
}