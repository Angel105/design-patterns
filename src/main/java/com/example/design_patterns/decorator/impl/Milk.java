package com.example.design_patterns.decorator.impl;

import com.example.design_patterns.decorator.Beverage;
import com.example.design_patterns.decorator.CondimentDecorator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Milk extends CondimentDecorator {

    private static final Logger logger = LoggerFactory.getLogger(Milk.class);

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        double cost = beverage.cost();
        return switch (beverage.getSize()) {
            case TALL -> cost + .05;
            case GRANDE -> cost + .10;
            case VENTI -> cost + .15;
            default -> cost + .5;
        };
    }
}
