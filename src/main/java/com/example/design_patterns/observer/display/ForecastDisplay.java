package com.example.design_patterns.observer.display;

import com.example.design_patterns.observer.DisplayElement;
import com.example.design_patterns.observer.Observer;
import com.example.design_patterns.observer.Subject;
import com.example.design_patterns.observer.WeatherData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ForecastDisplay implements Observer, DisplayElement {

    private static final Logger logger = LoggerFactory.getLogger(ForecastDisplay.class);

    private float currentPressure = 29.95f;
    private float lastPressure;
    private WeatherData weatherData;

    public ForecastDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        logger.info("Forecast: ");
        if (currentPressure > lastPressure) {
            logger.info("Weather improving is on the way!");
        } else if (currentPressure == lastPressure) {
            logger.info("No change");
        } else {
            logger.info("Weather is worsening, raining");
        }
    }

    @Override
    public void update() {
        lastPressure = currentPressure;
        currentPressure = weatherData.getPressure();

        display();
    }
}
