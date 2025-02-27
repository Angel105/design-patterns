package com.example.design_patterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Pizza {

    private static final Logger logger = LoggerFactory.getLogger(Pizza.class);

    protected String name;

    public void prepare() {
        logger.info("Preparing {}", name);
    }
    public void bake() {
        logger.info("Baking {}", name);
    }
    public void cut() {
        logger.info("Cutting {}", name);
    }
    public void box() {
        logger.info("Boxing {}", name);
    }

    @Override
    public String toString() {
        return name;
    }
}
