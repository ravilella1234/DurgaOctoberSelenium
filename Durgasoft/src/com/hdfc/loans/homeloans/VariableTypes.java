package com.hdfc.loans.homeloans;

public class VariableTypes 
{
	//primitive
	int i=10; //instance (or) non-static (or) global variable
	static String cname="vmware";  // static (or) global varaible
	static VariableTypes obj;
	
	
	public void m1()
	{
		int i=20; // local variable
		//System.out.println(j);
		
		System.out.println(this.i);

		System.out.println(cname);
	}
	
	public static void m2()
	{
		obj=new VariableTypes(); // reference variable
		System.out.println(obj.i);
		System.out.println(VariableTypes.cname);
	}

	public static void main(String[] args) 
	{
		obj=new VariableTypes(); // reference variable
		System.out.println(obj.i);
		System.out.println(VariableTypes.cname);
		System.out.println();
	}
}
