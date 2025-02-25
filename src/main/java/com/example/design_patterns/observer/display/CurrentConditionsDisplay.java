package com.example.design_patterns.observer.display;

import com.example.design_patterns.observer.DisplayElement;
import com.example.design_patterns.observer.Observer;
import com.example.design_patterns.observer.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private static final Logger logger = LoggerFactory.getLogger(CurrentConditionsDisplay.class);

    private float temperature;
    private float humidity;
    private Subject weatherData; /*Link to Subject to be used to cancel Subject observation*/

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        logger.info("Current conditions: {}F degrees and {}% humidity", temperature, humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }
}
