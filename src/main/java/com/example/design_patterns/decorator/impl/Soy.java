package com.example.design_patterns.decorator.impl;

import com.example.design_patterns.decorator.Beverage;
import com.example.design_patterns.decorator.CondimentDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Soy extends CondimentDecorator {

    private static final Logger logger = LoggerFactory.getLogger(Soy.class);

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
