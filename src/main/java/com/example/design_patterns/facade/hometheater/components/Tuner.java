package com.example.design_patterns.facade.hometheater.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tuner {
    private final static Logger logger = LoggerFactory.getLogger(Tuner.class);

    private final String description;
    private final Amplifier amp;
    private double frequency;

    public Tuner(String description, Amplifier amp) {
        this.description = description;
        this.amp = amp;
    }

    public void on() {
        logger.info("{} on", description);
    }
    public void off() {
        logger.info("{} off", description);
    }

    public void setAm() {
        logger.info("{} set AM mode", description);
    }

    public void setFm() {
        logger.info("{} set FM mode", description);
    }

    @Override
    public String toString() {
        return description;
    }

}
