package com.xworkz.assignments.things;

public class CurrentWeather extends Weather {
    protected String observationTime;
    protected String weatherDescription;
    protected double uvIndex;
    protected int airQualityIndex;
    
    public CurrentWeather() {
		System.out.println("Current Weather-no argument constructor.");
	}
}
