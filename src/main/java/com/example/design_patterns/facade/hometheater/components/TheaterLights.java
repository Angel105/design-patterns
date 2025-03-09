package com.example.design_patterns.facade.hometheater.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheaterLights {
    private final static Logger logger = LoggerFactory.getLogger(TheaterLights.class);

    private final String description;

    public TheaterLights(String description) {
        this.description = description;
    }

    public void dim(int level) {
        logger.info("{} dimming to level {}%", description, level);
    }

    public void on() {
        logger.info("{} on", description);
    }

    public void off() {
        logger.info("{} off", description);
    }

    @Override
    public String toString() {
        return description;
    }
}
