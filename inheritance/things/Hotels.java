package com.xworkz.inheritance.things;

public class Hotels {
	public String type;
	public String name;
	public String location;
	
	public Hotels() {
		System.out.println("Hotel - No argument constructor.");
	}
	
	public Hotels(String type, String name, String location) {
		this.type = type;
		this.name = name;
		this.location = location;
	}
	
	public void service() {
		System.out.println("Hotel - Service method.");
	}
	
	public void display() {
		System.out.println("Type:"+this.type+", Name:"+this.name+", Location:"+this.location);
	}

}
