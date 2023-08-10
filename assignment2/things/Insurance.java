package com.xworkz.assignment2.things;

import java.util.Date;

import com.xworkz.assignment2.interfaces.Bank;

public class Insurance implements Bank {
	Date startDate;
	Date endDate;
	int amt;
	GeneralInsurance gi;
	LifeInsurance li;
	
	public Insurance(Date startDate, Date endDate, int amt) {
		super();
		this.startDate = startDate;
		this.endDate = endDate;
		this.amt = amt;
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
		return "Insurance [startDate=" + startDate + ", endDate=" + endDate + ", amt=" + amt + "]";
	}

	@Override
	public String account(String acHolderName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int num(int acNum) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
