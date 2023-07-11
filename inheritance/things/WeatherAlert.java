package com.xworkz.inheritance.things;

public class WeatherAlert extends Weather {
    protected String alertType;
    protected String alertSeverity;
    protected String alertDescription;
    protected String alertTime;
    
    public WeatherAlert() {
    	System.out.println("WEather alert-no argument constructor.");
	}
}
