package com.example.design_patterns.adapter.impl;

import com.example.design_patterns.adapter.Duck;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MallardDuck implements Duck {

    private static final Logger logger = LoggerFactory.getLogger(MallardDuck.class);

    @Override
    public void quack() {
        logger.info("Quack");
    }

    @Override
    public void fly() {
        logger.info("I'm flying");
    }
}
