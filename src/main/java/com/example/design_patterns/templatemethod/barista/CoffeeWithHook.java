package com.example.design_patterns.templatemethod.barista;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    private static final Logger logger = LoggerFactory.getLogger(CoffeeWithHook.class);

    private final InputHandler inputHandler;

    public CoffeeWithHook(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    @Override
    void brew() {
        logger.info("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        logger.info("Adding sugar and milk");
    }

    @Override
    public boolean consumerWantsCondiments() {
        String answer = inputHandler.getUserInput("\nWould you like milk and sugar with your coffee (y/n)? ");
        return answer.toLowerCase().startsWith("y");
    }

}
