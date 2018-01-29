class NetSalary{

	public static void main(String args[])
	{
		//long value  = 9032543253l;
		int basicSalary = Integer.parseInt(args[0]);
		float hra = .03f * basicSalary; //6000	
		float da = .02f * basicSalary;	
		float ta = .01f * basicSalary;
		
		float allowances = hra + da + ta;
		int pf = 1400;

		float netSalary = basicSalary + allowances - pf;

		System.out.println("HRA is = " + hra);
		System.out.println("DA is = " + da);
		System.out.println("TA is = " + ta);

		
		System.out.println("Net Salary is = " + netSalary);

	}



}