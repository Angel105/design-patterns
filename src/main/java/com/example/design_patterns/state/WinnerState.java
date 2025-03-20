package com.example.design_patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WinnerState implements State {

    private static final String ALREADY_GIVING_GUMBALL_WARNING = "Please wait, we're already giving you a gumball";

    private final static Logger logger = LoggerFactory.getLogger(WinnerState.class);
    private final GumballMachine gumballMachine;


    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        logger.warn(ALREADY_GIVING_GUMBALL_WARNING);
    }

    @Override
    public void ejectQuarter() {
        logger.warn(ALREADY_GIVING_GUMBALL_WARNING);
    }

    @Override
    public void turnCrank() {
        logger.warn("Turning again doesn't get you another gumball!");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
             gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            logger.info("YOU'RE A WINNER! You got two gumballs for your quarter");
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                logger.warn("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }

    @Override
    public String toString() {
        return "despensing two gumballs for a price of one, because YOU'RE A WINNER!!!";
    }
}