package com.hdfc.loans.homeloans;

import java.util.Scanner;

public class ArrayDemo 
{

	public int m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size :");
		int asize = sc.nextInt();
		
		int[] a=new int[asize];
		int sum=0;
		
		System.out.println("Enter the afrray elements: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
		System.out.println("Sum of the array is : " + sum);
		return sum;
          
	}
	
	public static void main(String[] args) 
	{
		ArrayDemo a=new ArrayDemo();
		int count = a.m1();
		System.out.println("Sum of array in outside :" + count);
		
	}

}
