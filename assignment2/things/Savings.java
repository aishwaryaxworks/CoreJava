package com.xworkz.assignment2.things;

import java.util.Date;

public class Savings {
	Date startDate;
	Date endDate;
	int amt;
	
	public Savings() {
		System.out.println("Savings Class constructor!");
	}
	
	public Savings(Date startDate, Date endDate, int amt) {
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
		return "Savings [startDate=" + startDate + ", endDate=" + endDate + ", amt=" + amt + "]";
	}
	
}