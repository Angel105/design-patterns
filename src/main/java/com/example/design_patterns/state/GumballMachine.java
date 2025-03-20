package com.example.design_patterns.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GumballMachine {

    private final static Logger logger = LoggerFactory.getLogger(GumballMachine.class);
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;

    private State state;
    private int count = 0;

    public GumballMachine(int numberOfGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
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
