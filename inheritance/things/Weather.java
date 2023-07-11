package com.xworkz.inheritance.things;

public class Weather {
	protected String location;
    protected double latitude;
    protected double longitude;
    protected String country;
    protected String region;
    protected String timezone;
    protected String weatherCondition;
    protected double temperature;
    protected double feelsLike;
    protected double humidity;
    protected double windSpeed;
    protected String windDirection;
    protected double precipitation;
    protected String visibility;
    protected double pressure;
    protected String sunrise;
    protected String sunset;
    protected String[] hourlyForecast;
    protected String[] dailyForecast;
    protected String[] alerts;

    public Weather() {
		System.out.println("Weather-no argument constructor.");
	}

}
