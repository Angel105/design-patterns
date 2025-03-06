package com.example.design_patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GarageDoor {

    private static final Logger logger = LoggerFactory.getLogger(GarageDoor.class);

    public void up() {
        logger.info("Garage door is up");
    }

    public void down() {
        logger.info("Garage door is down");
    }

    public void stop() {
        logger.info("Garage door is stopped");
    }

    public void resumeMove() {
        logger.info("Garage door move resumed");
    }
}
