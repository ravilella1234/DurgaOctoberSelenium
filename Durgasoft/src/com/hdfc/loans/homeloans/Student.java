package com.hdfc.loans.homeloans;

public class Student 
{

	public Student() 
	{
		super();
		
	}
	
	public Student(int a,String b) 
	{
		this();
		System.out.println("ravillela");
		
	}
	
	public Student(int a,String b,float c) 
	{
		
		this(10,"ravi");
		
	}
	
	
	public static void main(String[] args) {
		Student s=new Student(1,"ravi",12.23f);
	}
}
