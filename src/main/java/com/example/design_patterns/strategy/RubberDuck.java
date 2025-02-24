package com.example.design_patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubberDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(RubberDuck.class);

    public RubberDuck(FlyBehavior fb, QuackBehavior qb) {
        flyBehavior = fb;
        quackBehavior = qb;
    }

    @Override
    public void display() {
        logger.info("I'm a rubber duck");
    }

}
