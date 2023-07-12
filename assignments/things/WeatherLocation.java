package com.xworkz.assignments.things;

public class WeatherLocation extends Weather {
    protected String locationName;
    protected double locationLatitude;
    protected double locationLongitude;
    protected String locationCountry;
    
    public WeatherLocation() {
    	System.out.println("Weather Location-no argument constructor.");
	}
    
    public void displayWeather() {
    	System.out.println("Weather Display method after overriding:");
    	System.out.println("Weather in country "+super.country);
    }
}
