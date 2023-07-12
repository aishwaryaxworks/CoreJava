package com.xworkz.inheritance.things;

public class RapidoLocation extends Rapido{
	protected String startPoint;
	protected String endPoint;
	
	public RapidoLocation() {
		super("Ravi","Hari");
		System.out.println(super.customerName);
		System.out.println("Location no argument constructor.");
	}
	
	public void displayLocation() {
		System.out.println(super.customerName);
	}
	
	public void display() {
		System.out.println("Overridden display method.");
	}
	
}
