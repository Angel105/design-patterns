package com.example.design_patterns.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MallardDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(MallardDuck.class);

    @Override
    public void display() {
        logger.info("MallardDuck is displaying itself");
    }


}
