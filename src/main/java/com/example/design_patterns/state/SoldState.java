package com.example.design_patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SoldState implements State {
    private final static Logger logger = LoggerFactory.getLogger(SoldState.class);
    private final GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        logger.warn("Please wait, we're already giving you a gumball");

    }

    @Override
    public void ejectQuarter() {
        logger.warn("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        logger.warn("Turning twice doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            logger.warn("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public String toString() {
        return "dispensing a gumball";
    }
}
