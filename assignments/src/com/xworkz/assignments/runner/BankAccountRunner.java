package com.xworkz.assignments.runner;

import com.xworkz.assignments.things.BankAccount;

public class BankAccountRunner {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount("7894561230","Alice",2300645.56,"SBI","Jayanagar");
		acc1.displayAccount();
		acc2.displayAccount();

	}

}
