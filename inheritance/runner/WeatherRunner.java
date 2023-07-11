package com.xworkz.inheritance.runner;

//import com.xworkz.inheritance.things.CurrentWeather;
//import com.xworkz.inheritance.things.HourlyForecastWeather;
//import com.xworkz.inheritance.things.DailyForecastWeather;
//import com.xworkz.inheritance.things.WeatherAlert;
import com.xworkz.inheritance.things.WeatherLocation;

/*public class WeatherRunner extends CurrentWeather{

	public static void main(String[] args) {
		WeatherRunner weather = new WeatherRunner();
		weather.airQualityIndex=50;
	}
}*/

/*public class WeatherRunner extends HourlyForecastWeather {
	public static void main(String[] args) {
		WeatherRunner weather = new WeatherRunner();
		weather.country="Italy";
	}
}*/

/*public class WeatherRunner extends DailyForecastWeather {
	public static void main(String[] args) {
		WeatherRunner weather = new WeatherRunner();
		weather.forecastDate="12 July,2023";
	}
}*/

/*public class WeatherRunner extends WeatherAlert {
	public static void main(String[] args) {
		WeatherRunner weather = new WeatherRunner();
		weather.alertDescription="Yellow alert for Thunder Storm";
}*/

public class WeatherRunner extends WeatherLocation {
	public static void main(String[] args) {
		WeatherRunner weather = new WeatherRunner();
		weather.humidity=78.6;
	}
}

