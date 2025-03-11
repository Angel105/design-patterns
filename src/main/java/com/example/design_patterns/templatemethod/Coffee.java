package com.example.design_patterns.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Coffee extends CaffeineBeverage {
    private static final Logger logger = LoggerFactory.getLogger(Coffee.class);

    @Override
    void brew() {
        logger.info("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        logger.info("Adding sugar and milk");
    }
}
