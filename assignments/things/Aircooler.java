package com.xworkz.assignments.things;

public class Aircooler {
	private double temperature;

	public Aircooler(double temperature) {
		this.temperature = temperature;
	}

	public String checkTemperature() {
		String weather;
		if (temperature < 10) {
			weather = "Cool";
		} else if (temperature >= 10 && temperature < 20) {
			weather = "Normal";
		} else if (temperature >= 20 && temperature < 30) {
			weather = "Warm";
		} else {
			weather = "Extremely Warm";
		}
		return weather;
	}

	public void turnOffAircooler() {
		if (checkTemperature().equals("Cool")) {
			System.out.println("Turning off the aircooler.");
		} else {
			System.out.println("Aircooler is still on.");
		}
	}
}
