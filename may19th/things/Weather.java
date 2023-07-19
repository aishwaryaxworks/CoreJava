package com.xworks.may19th.things;

public class Weather extends Rain {
	public Weather() {
		// super.range = 30;
		super.day = "Wednesday";
		super.day = "Thursday";
		// super.location="Bangalore";

		System.out.println("Range:" + super.range + ", Day:" + super.day + ", Location:" + super.location);
		System.out.println("Date:" + super.date);
		super.display1();
	}

	// instance method
	@Override
	void flood() {
		System.out.println("Flood - Weather");
	}

	/*
	 * @Override //final instance method final void display1() {
	 * System.out.println("Display1 - Rain"); }
	 * 
	 * final void display2(String duration) {
	 * System.out.println("Display2 - Rain - Duration");
	 */
	
	
	// static method
	static void wet() {
		System.out.println("Wet - Weather");
	}

}
