package com.example.design_patterns.observer.display;

import com.example.design_patterns.observer.DisplayElement;
import com.example.design_patterns.observer.Observer;
import com.example.design_patterns.observer.Subject;
import com.example.design_patterns.observer.WeatherData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Float.NEGATIVE_INFINITY;
import static java.lang.Float.POSITIVE_INFINITY;

public class StatisticsDisplay implements Observer, DisplayElement {

    private static final Logger logger = LoggerFactory.getLogger(StatisticsDisplay.class);

    private float maxTemp = NEGATIVE_INFINITY;
    private float minTemp = POSITIVE_INFINITY;
    private float tempSum = 0.0f;
    private int numReadings;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        logger.info("Avg/Max/Min temperature = {}/{}/{}", tempSum / numReadings, maxTemp, minTemp);
    }

    @Override
    public void update() {
        float temp = weatherData.getTemperature();
        tempSum += temp;
        numReadings++;

        if (temp > maxTemp) {
            maxTemp = temp;
        }

        if (temp < minTemp) {
            minTemp = temp;
        }

        display();
    }
}
