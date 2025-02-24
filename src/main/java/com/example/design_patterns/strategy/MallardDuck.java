package com.example.design_patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MallardDuck extends Duck implements Flyable, Quackable {

    private static final Logger logger = LoggerFactory.getLogger(MallardDuck.class);

    @Override
    public void display() {
        logger.info("MallardDuck is displaying itself");
    }

    @Override
    public void fly() {
        logger.info("MallardDuck is flying");
    }

    @Override
    public void quack() {
        logger.info("MallardDuck is quacking");
    }
}
