package com.hdfc.loans.homeloans;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class ExceptionDemo 
{

	public static void main(String[] args) 
	{
		int nr,dr,result;
		
		
		
		Scanner sc=new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("Eneter the Numarator value :");
			nr=sc.nextInt();
			System.out.println("Eneter the Denominator value :");
			dr=sc.nextInt();
			
			try 
			{
				result = nr / dr;
				System.out.println(result);
				break;
			} 
			catch (ArithmeticException e)
			{
				//e.printStackTrace();
				//System.out.println(e);
				System.out.println("Denominator value should be greater than zero....");
			} 

		}

	}

}
