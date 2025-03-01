package com.example.design_patterns.factory.strategy.impl;

import com.example.design_patterns.factory.strategy.CuttingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultCuttingStrategy implements CuttingStrategy {

    private static final Logger logger = LoggerFactory.getLogger(DefaultCuttingStrategy.class);

    @Override
    public void cut(String pizzaName) {
        logger.info("Cutting '{}' into diagonal slices", pizzaName);
    }
}
