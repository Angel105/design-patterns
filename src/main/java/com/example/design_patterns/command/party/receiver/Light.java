package com.example.design_patterns.command.party.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Light {

    private static  final Logger logger = LoggerFactory.getLogger(Light.class);

    private final String location;
    private int level;

    public Light(String location) {
        this.location = location;
    }


    public void on() {
        level = 100;
        logger.info("{} Light on", location);
    }

    public void off() {
        level = 0;
        logger.info("{} Light off", location);
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            logger.info("{} Light is dimmed to {}%", location, level);
        }
    }

    public int getLevel() {
        return level;
    }
}
