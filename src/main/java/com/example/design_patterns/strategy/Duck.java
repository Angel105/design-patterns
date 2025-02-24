package com.example.design_patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Duck {

    // Initialize the logger
    private static final Logger logger = LoggerFactory.getLogger(Duck.class);

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        logger.info("Duck is swimming...");
    }

    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

}
