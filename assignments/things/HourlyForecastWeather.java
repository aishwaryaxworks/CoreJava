package com.xworkz.assignments.things;

public class HourlyForecastWeather extends Weather {
    protected String forecastTime;
    protected double forecastTemperature;
    protected double forecastPrecipitation;
    protected double forecastWindSpeed;
    
    public HourlyForecastWeather() {
    	System.out.println("Hourly forecast-no argument constructor.");
	}
}
