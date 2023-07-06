package com.xworkz.inheritance.things;

public class Outdoor extends Games {
	public boolean is_raining;
	
	public Outdoor() {
		System.out.println("Outdoor-No argument constructor.");
	}
	
	public Outdoor(boolean is_raining) {
		this.is_raining = is_raining;
		System.out.println("Outdoor-All argument constructor.");
	}
	
	public void displayOutdoor() {
		System.out.println("Is it raining:"+this.is_raining);
	}

}
