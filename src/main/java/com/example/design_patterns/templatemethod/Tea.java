package com.example.design_patterns.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Tea extends CaffeineBeverage {
    private static final Logger logger = LoggerFactory.getLogger(Tea.class);

    @Override
    void brew() {
        logger.info("Steeping the tea");
    }

    @Override
    void addCondiments() {
        logger.info("Adding Lemon");
    }

}
