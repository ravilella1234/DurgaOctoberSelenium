package com.hdfc.loans.homeloans;

public class ChildClass extends Employee
{
	String address;

	public ChildClass(String address) 
	{
		super(100,"sai",23.45f);
		this.address=address;
		
		System.out.println(this.address);
	}
	
	public void m1()
	{
		System.out.println(this.address);
	}
	
	

	public static void main(String[] args) 
	{
		ChildClass c=new ChildClass("Hyderabad");

	}

}
