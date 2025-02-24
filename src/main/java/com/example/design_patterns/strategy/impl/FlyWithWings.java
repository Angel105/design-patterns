package com.example.design_patterns.strategy.impl;

import com.example.design_patterns.strategy.FlyBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyWithWings implements FlyBehavior {

    private static final Logger logger = LoggerFactory.getLogger(FlyWithWings.class);

    @Override
    public void fly() {
        logger.info("I'm flying with my wings");
    }
}
