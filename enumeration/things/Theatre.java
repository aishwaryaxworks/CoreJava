package com.xworkz.enumeration.things;

public class Theatre {
	TheatreName name;
    String address;
    int capacity;
    double ticketPrice=500;
    
    public Theatre() {
		System.out.println("no argument constructor-Theatre");
	}
    
    public Theatre(String address) {
    	this.address=address;
		System.out.println("Theatre address:"+this.address);
	}

	public Theatre(TheatreName name, String address, int capacity, double ticketPrice) {
		this.name = name;
		this.address = address;
		this.capacity = capacity;
		this.ticketPrice = ticketPrice;
	}
	
	public void displayTheatre() {
		System.out.println("Theatre details: "+this.name+", "+this.address+", "+this.capacity+", "+this.ticketPrice);
	}
	
	public void setCapacity(int capacity) {
		this.capacity=capacity;
	}    
    
}
