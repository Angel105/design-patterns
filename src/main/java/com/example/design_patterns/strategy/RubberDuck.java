package com.example.design_patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubberDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(RubberDuck.class);

    @Override
    public void display() {
        logger.info("RubberDuck is displaying itself");
    }

    @Override
    public void quack() {
        logger.info("RubberDuck is not quacking");
    }

    @Override
    public void fly() {
        // empty override
    }
}
