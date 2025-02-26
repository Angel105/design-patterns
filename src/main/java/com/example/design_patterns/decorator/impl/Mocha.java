package com.example.design_patterns.decorator.impl;

import com.example.design_patterns.decorator.Beverage;
import com.example.design_patterns.decorator.CondimentDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Mocha extends CondimentDecorator {

    private static final Logger logger = LoggerFactory.getLogger(Mocha.class);

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
