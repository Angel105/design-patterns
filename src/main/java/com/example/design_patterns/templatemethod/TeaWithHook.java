package com.example.design_patterns.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TeaWithHook extends CaffeineBeverageWithHook {
    private static final Logger logger = LoggerFactory.getLogger(TeaWithHook.class);

    private final InputHandler inputHandler;

    public TeaWithHook(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    @Override
    void brew() {
        logger.info("Steeping the tea");
    }

    @Override
    void addCondiments() {
        logger.info("Adding Lemon");
    }

    @Override
    public boolean consumerWantsCondiments() {
        String answer = inputHandler.getUserInput("Would you like lemon with your tea (y/n)? ");
        return answer.toLowerCase().startsWith("y");
    }

}
