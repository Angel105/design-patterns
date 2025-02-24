package com.example.design_patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedheadDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(RedheadDuck.class);

    @Override
    public void display() {
        logger.info("RedheadDuck is displaying itself");
    }
}
