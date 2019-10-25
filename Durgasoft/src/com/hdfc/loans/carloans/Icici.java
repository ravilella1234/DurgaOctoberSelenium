package com.hdfc.loans.carloans;

public class Icici implements Rbi
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Icici i=new Icici();
		i.deposit();
		i.withdrawl();
	}

	@Override
	public void withdrawl() {
		System.out.println("iam overriden withdrawl from ICICI");
		
	}

	@Override
	public void deposit() {
		System.out.println("iam overriden deposit from ICICI");
		
	}

}
