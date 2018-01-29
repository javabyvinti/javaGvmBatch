class Swap{
	

	// with using third variable

	public static void main(String args[]){
		
		int value1 = 20, value2 = 50;
		int temp = 0;

		temp = value1;	// temp = 20/ value1 = 20
		value1 = value2;// value1 = 50/value2 =50
		value2 = temp;					
		
		System.out.println("Value1 is = "+value1);

		System.out.println("Value2 is = " +value2);

	}


}
