package com.bmpl.javabasic;


class MyData{
	
	private String name; // private --> inside the class
	private int phn;//default
	
	// functions --> setter and getter
	
	
	
	
	MyData(){
		name = "Ram";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name.trim();
		this.name = name;
	}

	public int getPhn() {
		return phn;
	}

	public void setPhn(int phn) {
		if(phn>0){
			this.phn = phn;	
		} else{
			System.out.println("Phone no. cannot be negative");
		}
		
	}

	void valueAssigned(){
		
		name = "Ram Kumar";
		MyData myData = new MyData();
		
	}
	
	
}

// inheritance or class-object

public class PrivateData {

	public static void main(String[] args) {
		
		MyData myData = new MyData();
		myData.valueAssigned();
		
		myData.setName("                 Ram");
		myData.setPhn(657674);
		System.out.println(myData.getName());
		System.out.print("Name is:\t" + myData.getName());
		
		//myData.name;
		
		
		
		
	}

}
