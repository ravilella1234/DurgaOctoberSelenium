package com.hdfc.loans.homeloans;

public  class FinalVariable
{
	
	/*public void m1(int i)
	{
		System.out.println(i);
	}*/
	
	/*public void m1(float i)
	{
		System.out.println(i);
	}*/
	
	public void m1(String i)
	{
		System.out.println(i);
	}
	
	
	public static void main(String[] args) 
	{
		FinalVariable obj=new FinalVariable();
		obj.m1(100);
		obj.m1(12.34f);
		obj.m1("ravilella");

	}

}
