package com.hdfc.loans.carloans;

public class ChildClass extends FirstAbstarct
{

	public static void main(String[] args) {
		ChildClass c=new ChildClass();
		c.m1();
		c.m2();

	}
	
	public void m1()
	{
		System.out.println("iam m1 overriden concrete from ChildCLass");
	}

	@Override
	public void m2() {
		System.out.println("iam overriden m2 from ChildCLass");
		
	}

}
