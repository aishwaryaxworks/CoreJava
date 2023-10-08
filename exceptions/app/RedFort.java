package com.xworkz.exceptions.app;

import java.util.Date;

public class RedFort {
	private String visitorName;
	private Date date;
	private int ticketPrice;
		
	public RedFort(String visitorName, Date date, int ticketPrice) {
		this.visitorName = visitorName;
		this.date = date;
		this.ticketPrice = ticketPrice;
	}
	public String getVisitorName() {
		return visitorName;
	}
	public void setVisitorName(String visitorName) {
		this.visitorName = visitorName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(int ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	@Override
	public String toString() {
		return "RedFort [visitorName=" + visitorName + ", date=" + date + ", ticketPrice=" + ticketPrice + "]";
	}

}
