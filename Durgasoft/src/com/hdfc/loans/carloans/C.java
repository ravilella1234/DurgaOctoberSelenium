package com.hdfc.loans.carloans;

import com.hdfc.loans.homeloans.A;

public class C extends A
{
	
	public void m1()
	{
		System.out.println("iam overriden  m1 from class C");
	}
	
	public void m3()
	{
		System.out.println("iam m3 from class C");
	}

	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		
		/*C c=new C();
		c.m1();
		c.m3();*/
		
		A obj=new C();
		obj.m1();
		
		//C obj1=new A();
		
	}

}
