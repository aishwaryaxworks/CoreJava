package com.xworkz.assignment2.things;

import java.util.Date;

import com.xworkz.assignment2.interfaces.Bank;

public class FD implements Bank {
	Date startDate;
	Date endDate;
	int amt;
	private Savings savings;
	
	public FD() {
		System.out.println("FD class constructor!");
	}
	
	
	public FD(Savings savings) {
		this.savings=savings;
		System.out.println("FD class constructor!");
	}

	public Savings getSavings() {
		return savings;
	}


	public void setSavings(Savings savings) {
		this.savings = savings;
	}


	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public int getAmt() {
		return amt;
	}

	public void setAmt(int amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "FD [startDate=" + startDate + ", endDate=" + endDate + ", amt=" + amt + ", savings=" + savings + "]";
	}


	@Override
	public String account(String acHolderName) {
		// TODO Auto-generated method stub
		return "Account Name";
	}


	@Override
	public int num(int acNum) {
		// TODO Auto-generated method stub
		return 54694;
	}
	
}
