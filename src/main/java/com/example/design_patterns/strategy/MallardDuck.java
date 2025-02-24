package com.example.design_patterns.strategy;

import com.example.design_patterns.strategy.impl.FlyWithWings;
import com.example.design_patterns.strategy.impl.Quack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MallardDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(MallardDuck.class);

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        logger.info("I'm a real Mallard duck");
    }

}
