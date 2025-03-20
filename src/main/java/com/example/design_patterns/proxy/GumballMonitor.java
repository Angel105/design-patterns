package com.example.design_patterns.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GumballMonitor {
    private final static Logger logger = LoggerFactory.getLogger(GumballMonitor.class);
    private final GumballMachine machine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.machine = gumballMachine;
    }

    public void report() {
        logger.info("Gumball Machine: {}", machine.getLocation());
        logger.info("Current inventory: {} gumballs", machine.getCount());
        logger.info("Current state: {}", machine.getState());
    }

}
