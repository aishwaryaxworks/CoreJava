package com.xworkz.inheritance.things;

public class WeatherLocation extends Weather {
    protected String locationName;
    protected double locationLatitude;
    protected double locationLongitude;
    protected String locationCountry;
    
    public WeatherLocation() {
    	System.out.println("Weather Location-no argument constructor.");
	}
}
