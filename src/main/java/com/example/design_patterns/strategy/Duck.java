package com.example.design_patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Duck {

    // Initialize the logger
    private static final Logger logger = LoggerFactory.getLogger(Duck.class);

    public void quack() {
        logger.info("Duck is quacking!");
    }

    public void swim() {
        logger.info("Duck is swimming...");
    }

    public abstract void display();
    public void fly() {
        logger.info("Abstract Duck is flying...");
    }

}
