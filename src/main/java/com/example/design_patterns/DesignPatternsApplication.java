package com.example.design_patterns;

import com.example.design_patterns.observer.WeatherData;
import com.example.design_patterns.observer.display.CurrentConditionsDisplay;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {


	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(78,90,29.2f);
		weatherData.setMeasurements(82,70,29.2f);
		weatherData.setMeasurements(80,65,30.4f);

	}

}
