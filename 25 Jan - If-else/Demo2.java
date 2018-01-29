class Demo2{
	
	public static void main(String args[])
	{
		System.out.println("Executed");
	
		Demo2 demo2 = new Demo2();

		main("Hello");

		demo2.main(10);
	}
	// method overload
	public static void main(String args){

		System.out.println(args);
	}
	void main(int value){
		System.out.println(value);
	}
}