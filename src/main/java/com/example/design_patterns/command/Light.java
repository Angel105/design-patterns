package com.example.design_patterns.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Light {

    private static  final Logger logger = LoggerFactory.getLogger(Light.class);

    public void on() {
        logger.info("Light on");
    }

    public void off() {
        logger.info("Light off");
    }
}
