package com.example.design_patterns.facade.hometheater.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Projector {
    private final static Logger logger = LoggerFactory.getLogger(Projector.class);

    private final String description;
    private final StreamingPlayer streamingPlayer;

    public Projector(String description, StreamingPlayer streamingPlayer) {
        this.description = description;
        this.streamingPlayer = streamingPlayer;
    }

    public void on() {
        logger.info("{} on", description);
    }
    public void off() {
        logger.info("{} off", description);
    }
    public void wideScreenMode() {
        logger.info("{} in widescreen mode (16x9 aspect ratio)", description);
    }

    public void tvMode() {
        logger.info("{} in tv mode (4x3 aspect ratio)", description);
    }

    @Override
    public String toString() {
        return description;
    }

}
