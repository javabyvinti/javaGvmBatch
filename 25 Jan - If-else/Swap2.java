class Swap2{
	

	// without using third variable

	public static void main(String args[]){
		
		int value1 = 20, value2 = 50;
		
		value1 = value1 + value2;// 20 + 50  = value1 = 70
		value2 = value1 - value2;//70 - 50 = value2 =  20
		value1 = value1 - value2;// 70 - 20 = 50

		
		System.out.println("Value1 is = "+value1);

		System.out.println("Value2 is = " +value2);

	}


}
