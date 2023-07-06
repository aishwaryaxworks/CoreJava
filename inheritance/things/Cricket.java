package com.xworkz.inheritance.things;

public class Cricket extends Outdoor{
	public int duration;
	
	public Cricket() {
		System.out.println("Cricket-No argument constructor.");
	}
	
	public Cricket(int duration) {
		this.duration = duration;
		System.out.println("Cricket-All argument constructor.");
	}
	
	public void displayCricket() {
		System.out.println("Duration:"+this.duration);
	}
}
