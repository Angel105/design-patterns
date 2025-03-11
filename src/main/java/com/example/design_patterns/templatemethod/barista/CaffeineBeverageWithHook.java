package com.example.design_patterns.templatemethod.barista;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class CaffeineBeverageWithHook {

    private final static Logger logger = LoggerFactory.getLogger(CaffeineBeverageWithHook.class);

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (consumerWantsCondiments()) {
            addCondiments();
        }
    }

    public boolean consumerWantsCondiments() {
        return true;
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
