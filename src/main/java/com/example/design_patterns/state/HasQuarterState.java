package com.example.design_patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class HasQuarterState implements State {
    private final static Logger logger = LoggerFactory.getLogger(HasQuarterState.class);
    private final GumballMachine gumballMachine;
    private Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        logger.warn("You can't insert another quarter");

    }

    @Override
    public void ejectQuarter() {
        logger.info("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        logger.info("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        logger.info("No gumball dispensed");
    }

    @Override
    public String toString() {
        return "waiting for turn of crank";
    }
}
