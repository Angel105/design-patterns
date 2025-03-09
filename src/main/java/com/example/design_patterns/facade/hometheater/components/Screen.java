package com.example.design_patterns.facade.hometheater.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Screen {
    private final static Logger logger = LoggerFactory.getLogger(Screen.class);

    private final String description;

    public Screen(String description) {
        this.description = description;
    }

    public void down() {
        logger.info("{} going down", description);
    }

    public void up() {
        logger.info("{} going up", description);
    }

    @Override
    public String toString() {
        return description;
    }
}
