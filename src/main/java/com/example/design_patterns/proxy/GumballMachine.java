package com.example.design_patterns.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GumballMachine {

    private final static Logger logger = LoggerFactory.getLogger(GumballMachine.class);
    private final State soldOutState;
    private final State noQuarterState;
    private final State hasQuarterState;
    private final State soldState;
    private final State winnerState;
    private final String location;

    private State state;
    private int count = 0;

    public GumballMachine(String location, int numberOfGumballs) {
        this.location = location;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberOfGumballs;
        if (numberOfGumballs > 0) {
            state = noQuarterState;
        } else {
            state = soldOutState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void releaseBall() {
        logger.info("A gumball comes rolling out the slot...");
        if (count != 0) {
            count = count - 1;
        }
    }
    public void refill(int numberOfGumballs) {
        count += numberOfGumballs;
        logger.info("The gumball machine was just refilled, and now has {} gumballs", count);
        if (count > 0) {
            setState(noQuarterState);
        } else {
            setState(soldOutState);
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public State getWinnerState() {
             return winnerState;
    }

    public String getLocation() {
        return location;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nMighty Gumball, Inc.\nJava-enabled Standing Gumball Model #2004\nInventory: ")
                .append(count).append(" gumball").append(count != 1 ? "s" : "");
        sb.append("\nMachine is ");
        sb.append(state).append("\n");
        return sb.toString();
    }
}
