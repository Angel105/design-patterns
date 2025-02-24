package com.example.design_patterns.strategy;

import com.example.design_patterns.strategy.impl.FlyWithWings;
import com.example.design_patterns.strategy.impl.Quack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedheadDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(RedheadDuck.class);

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        logger.info("I'm a real Red headed duck");
    }
}
