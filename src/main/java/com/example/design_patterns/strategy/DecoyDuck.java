package com.example.design_patterns.strategy;

import com.example.design_patterns.strategy.impl.FlyNoWay;
import com.example.design_patterns.strategy.impl.MuteQuack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DecoyDuck extends Duck {

    private static final Logger logger = LoggerFactory.getLogger(DecoyDuck.class);

    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    @Override
    public void display() {
        logger.info("I'm a duck Decoy");
    }
}
