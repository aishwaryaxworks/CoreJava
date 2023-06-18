package com.xworkz.assignments.things;

public class BankAccount {
	public String accountNumber;
	public String accountHolderName;
	public double balance;
	public String bankName;
	public String branch;
	
	//default constructor
	public BankAccount() {
		System.out.println("------Default Constructor.-----");
	}

	//parameterized constructor
	public BankAccount(String accountNumber, String accountHolderName, double balance, 
			String bankName, String branch) {
		System.out.println("-----Parameterized Constructor.-----");
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.bankName = bankName;
		this.branch = branch;		
	}

	public void displayAccount() {
		System.out.println("Acc Num:"+this.accountNumber+", Acc holder name:"+this.accountHolderName+
				", Balance:"+this.balance+", Bank:"+this.bankName+", Branch:"+this.branch);
	}

}
