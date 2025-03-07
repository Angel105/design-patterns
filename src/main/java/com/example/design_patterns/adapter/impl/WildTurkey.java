package com.example.design_patterns.adapter.impl;

import com.example.design_patterns.adapter.Turkey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WildTurkey implements Turkey {

    private static final Logger logger = LoggerFactory.getLogger(WildTurkey.class);

    @Override
    public void gobble() {
        logger.info("Gobble gobble");
    }

    @Override
    public void fly() {
        logger.info("I'm flying a short distance");
    }
}
