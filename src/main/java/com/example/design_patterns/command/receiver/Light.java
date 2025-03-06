package com.example.design_patterns.command.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Light {

    private static  final Logger logger = LoggerFactory.getLogger(Light.class);

    private final String location;

    public Light(String location) {
        this.location = location;
    }


    public void on() {
        logger.info("{} Light on", location);
    }

    public void off() {
        logger.info("{} Light off", location);
    }
}
