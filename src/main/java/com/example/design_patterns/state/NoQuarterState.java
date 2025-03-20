package com.example.design_patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoQuarterState implements State {
    private final static Logger logger = LoggerFactory.getLogger(NoQuarterState.class);
    private final GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        logger.info("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        logger.warn("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        logger.warn("You turned, but there's no quarter");
    }

    @Override
    public void dispense() {
        logger.warn("You need to pay first");
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}
