package com.example.design_patterns.command.dinner.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Cook {

    private final static Logger logger = LoggerFactory.getLogger(Cook.class);

    public void makeBurger() {
        logger.info("Cooking Burger ...");
    }

    public void makeFries() {
        logger.info("Cooking Fries ...");
    }
}
