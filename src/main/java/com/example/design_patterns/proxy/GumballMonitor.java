package com.example.design_patterns.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.rmi.RemoteException;

public class GumballMonitor {
    private final static Logger logger = LoggerFactory.getLogger(GumballMonitor.class);
    private final GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.machine = gumballMachine;
    }

    public void report() {
        try {
            logger.info("Gumball Machine: {}", machine.getLocation());
            logger.info("Current inventory: {} gumballs", machine.getCount());
            logger.info("Current state: {}", machine.getState());
        } catch (RemoteException e) {
            logger.error("{}", e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
