package com.example.design_patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoyDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(DecoyDuck.class);

    @Override
    public void display() {
        logger.info("I'm a duck Decoy");
    }
}
