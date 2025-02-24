package com.example.design_patterns.strategy;

import com.example.design_patterns.strategy.impl.FlyNoWay;
import com.example.design_patterns.strategy.impl.Quack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModelDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(ModelDuck.class);

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        logger.info("I'm a model duck");
    }
}
