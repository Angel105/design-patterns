package com.example.design_patterns;

import com.example.design_patterns.observer.WeatherData;
import com.example.design_patterns.observer.display.CurrentConditionsDisplay;
import com.example.design_patterns.observer.display.ForecastDisplay;
import com.example.design_patterns.observer.display.HeatIndexDisplay;
import com.example.design_patterns.observer.display.StatisticsDisplay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {


	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80,65,30.4f);
		weatherData.setMeasurements(82,70,29.2f);
		weatherData.setMeasurements(78,90,29.2f);

		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(62,90,28.1f);
	}

}
