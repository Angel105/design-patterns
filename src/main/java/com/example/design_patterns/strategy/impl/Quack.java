package com.example.design_patterns.strategy.impl;

import com.example.design_patterns.strategy.QuackBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Quack implements QuackBehavior {

    private static final Logger logger = LoggerFactory.getLogger(Quack.class);

    @Override
    public void quack() {
        logger.info("Quack");
    }
}
