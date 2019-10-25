package com.hdfc.loans.homeloans;

import java.util.Date;

public  class A 
{
	
	public  void m1()
	{
		System.out.println("iam m1 from class A");
	}
	
	public static void m5()
	{
		System.out.println("iam static m5 method...");
	}
	
	static
	{
		Date dt =new Date();
		System.out.println(dt);
	}
	
	static
	{
		System.out.println("iam static block2....");
	}
	
	public static void main(String[] args) 
	{
		A a=new A();
		a.m1();
		m5();
		
	}

}


