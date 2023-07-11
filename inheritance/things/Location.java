package com.xworkz.inheritance.things;

public class Location extends Rapido{
	protected String startPoint;
	protected String endPoint;
	
	public Location() {
		super("Ravi","Hari");
		System.out.println(super.customerName);
		System.out.println("Location no argument constructor.");
	}
	
	public void displayLocation() {
		System.out.println(super.customerName);
	}
	
	
	
}
