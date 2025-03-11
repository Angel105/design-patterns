package com.example.design_patterns.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CaffeineBeverage {

    private final static Logger logger = LoggerFactory.getLogger(CaffeineBeverage.class);

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    private void pourInCup() {
        logger.info("Pouring into cup");
    }

    private void boilWater() {
        logger.info("Boiling water");
    }
}
