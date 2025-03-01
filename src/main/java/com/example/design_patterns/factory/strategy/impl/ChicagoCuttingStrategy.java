package com.example.design_patterns.factory.strategy.impl;

import com.example.design_patterns.factory.strategy.CuttingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoCuttingStrategy implements CuttingStrategy {

    private static final Logger logger = LoggerFactory.getLogger(ChicagoCuttingStrategy.class);

    @Override
    public void cut(String pizzaName) {
        logger.info("Cutting '{}' into square slices", pizzaName);
    }
}
