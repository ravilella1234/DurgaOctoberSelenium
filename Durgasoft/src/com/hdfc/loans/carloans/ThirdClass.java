package com.hdfc.loans.carloans;

public class ThirdClass 
{
	
	int a=10,b=20,c;  // properties
	
	public void add()
	{
		c=a+b;
		System.out.println("ADD of A & B is :" + c);
	}
	
	public void sub()
	{
		c=a-b;
		System.out.println("SUB of A & B is :" + c);
	}

	public static void main(String[] args) 
	{
		ThirdClass obj=new ThirdClass();
		obj.add();
		obj.sub();
		
		ThirdClass obj1=new ThirdClass();
		obj1.add();
		obj1.sub();

	}

}
