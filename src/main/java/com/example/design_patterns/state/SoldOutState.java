package com.example.design_patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoldOutState implements State {
    private final static Logger logger = LoggerFactory.getLogger(SoldOutState.class);
    private final GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        logger.warn("You can't insert a quarter - the machine is sold out");

    }

    @Override
    public void ejectQuarter() {
        logger.warn("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        logger.warn("You turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        logger.warn("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "sold out";
    }
}
