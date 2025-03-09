package com.example.design_patterns.facade.hometheater.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PopcornPopper {

    private final static Logger logger = LoggerFactory.getLogger(PopcornPopper.class);

    private final String description;

    public PopcornPopper(String description) {
        this.description = description;
    }

    public void on() {
        logger.info("{} on", description);
    }

    public void off() {
        logger.info("{} off", description);
    }

    public void pop() {
        logger.info("{} popping popcorn!", description);
    }

    @Override
    public String toString() {
        return description;
    }
}
