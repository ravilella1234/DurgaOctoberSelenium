package com.hdfc.loans.homeloans;

import java.util.Scanner;

public class UserDefineException extends Exception
{

	public UserDefineException(String exceptionMessage) 
	{
		super(exceptionMessage);
	}

	public static void main(String[] args) 
	{
		String name;
		
		Scanner sc=new Scanner(System.in);
		
		
		while (true) {
			System.out.println("Enter the String :");
			name=sc.nextLine();
			if (name.length() != 10) {
				try {
					throw new UserDefineException("String should be 10 character String");
				} catch (UserDefineException e) {
					e.printStackTrace();
				}
			} else {
				System.out.println(name);
				break;
			} 
		}
		

	}

}
