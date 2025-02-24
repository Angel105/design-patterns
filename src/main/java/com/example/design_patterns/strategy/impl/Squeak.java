package com.example.design_patterns.strategy.impl;

import com.example.design_patterns.strategy.QuackBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Squeak implements QuackBehavior {
    private static final Logger logger = LoggerFactory.getLogger(Squeak.class);

    @Override
    public void quack() {
        logger.info("Squeak");
    }
}
