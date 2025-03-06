package com.example.design_patterns.command.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CeilingFan {
    private final static Logger logger = LoggerFactory.getLogger(CeilingFan.class);

    private final String location;
    private int level;

    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    public CeilingFan(String location) {
        this.location = location;
    }

    /**
     * Sets the ceiling fan speed to high.
     */
    public void high() {
        level = HIGH;
        logger.info("{} ceiling fan is on high", location);
    }

    /**
     * Sets the ceiling fan speed to medium.
     */
    public void medium () {
        level = MEDIUM ;
        logger.info("{} ceiling fan is on medium", location);
    }

    /**
     * Sets the ceiling fan speed to low.
     */
    public void low () {
        level = LOW ;
        logger.info("{} ceiling fan is on low", location);
    }

    /**
     * Turns off the ceiling fan by setting the speed level to 0.
     */
    public void off() {
        level = OFF;
        logger.info("{} ceiling fan is off", location);
    }


    public int getSpeed() {
        return level;
    }

    public void restoreSpeed(int previousSpeed) {
        switch (previousSpeed) {
            case HIGH:
                high();
                break;
            case MEDIUM:
                medium();
                break;
            case LOW:
                low();
                break;
            case OFF:
            default:
                off();
        }
    }

}
