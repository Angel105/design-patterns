package com.example.design_patterns.command.party.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GarageDoor {

    private static final Logger logger = LoggerFactory.getLogger(GarageDoor.class);

    private final String location;

    public GarageDoor() {
        this("Garage");
    }

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        logger.info("{} Garage door is up", location);
    }

    public void down() {
        logger.info("{} Garage door is down", location);
    }

    public void stop() {
        logger.info("{} Garage door is stopped", location);
    }

    public void resumeMove() {
        logger.info("{} Garage door move resumed", location);
    }
}
