package com.xworkz.assignments.things;

public class DailyForecastWeather extends Weather {
	protected String forecastDate;
	protected double forecastMaxTemperature;
	protected double forecastMinTemperature;
	protected String forecastSunrise;

	public DailyForecastWeather() {
		System.out.println("Daily Forecast-no argument constructor.");
	}
}
