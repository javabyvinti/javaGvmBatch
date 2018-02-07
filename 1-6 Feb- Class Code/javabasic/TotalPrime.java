package com.bmpl.javabasic;
 
public class TotalPrime {

	public static void main(String[] args) {
		
		int value = 0;
		String primeNo = "";
		
		//2 to userValue-1 --> 	 
		for(int i = 1; i<=100; i++){//5<=100
			int primeCount = 0;	// 0
			
			for(value = i; value>=1; value--){//0>=1
				
				if(i%value==0)//4%1==0
				{
					primeCount = primeCount+1;//3
				}
			}
			if(primeCount == 2){
				primeNo = primeNo + i + " ";	// 2 3 
			}
		}
		System.out.println("Total Prime are = " + primeNo);
		//2 3
	}
}