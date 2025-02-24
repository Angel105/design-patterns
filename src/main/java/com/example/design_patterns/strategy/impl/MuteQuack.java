package com.example.design_patterns.strategy.impl;

import com.example.design_patterns.strategy.QuackBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MuteQuack implements QuackBehavior {

    private static final Logger logger = LoggerFactory.getLogger(MuteQuack.class);

    @Override
    public void quack() {
        logger.info("<< Silence >>");
    }
}
