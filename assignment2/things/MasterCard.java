package com.xworkz.assignment2.things;

import java.util.Date;

public class MasterCard {
	Date startDate;
	Date endDate;
	int amt;
	
	public MasterCard(Date startDate, Date endDate, int amt) {
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
		return "MasterCard [startDate=" + startDate + ", endDate=" + endDate + ", amt=" + amt + "]";
	}
	
}
