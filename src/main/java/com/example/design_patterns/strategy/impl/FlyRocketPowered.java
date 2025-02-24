package com.example.design_patterns.strategy.impl;

import com.example.design_patterns.strategy.FlyBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FlyRocketPowered implements FlyBehavior {

    private static final Logger logger = LoggerFactory.getLogger(FlyRocketPowered.class);

    @Override
    public void fly() {
        logger.info("I'm flying with my rocket engines!");
    }
}
