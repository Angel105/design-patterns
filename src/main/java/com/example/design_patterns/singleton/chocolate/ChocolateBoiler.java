package com.example.design_patterns.singleton.chocolate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public enum ChocolateBoiler {
    UNIQUE_INSTANCE;

    private static final Logger logger = LoggerFactory.getLogger(ChocolateBoiler.class);

    private boolean empty;
    private boolean boiled;

    static {
        logger.info("Thread {} is creating unique instance of ChocolateBoiler", Thread.currentThread().getId());
    }

    ChocolateBoiler() {
        empty = true;
        boiled = false;
    }

    // Thread-safe fill() method
    public synchronized void fill() {
        logger.info("Thread {} is trying to fill the boiler.", Thread.currentThread().getId());
        if (empty) {
            empty = false;
            boiled = false;
            logger.info("Thread {} is filling the boiler with chocolate and milk.", Thread.currentThread().getId());

            try {
                Thread.sleep((int) (Math.random() * 300)); // Random simulated delay
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        } else {
            logger.error("Thread {} find the boiler already full; cannot fill again.", Thread.currentThread().getId());
        }
    }

    // Thread-safe boil() method
    public synchronized void boil() {
        logger.info("Thread {} is trying to boil.", Thread.currentThread().getId());
        if (!empty && !boiled) {
            boiled = true;
            logger.info("Thread {} is boiling the contents.", Thread.currentThread().getId());
        } else if (empty) {
            logger.error("Thread {} finds the boiler empty; cannot boil.", Thread.currentThread().getId());
        } else {
            logger.error("Thread {} finds the contents already boiled; cannot boil again", Thread.currentThread().getId());
        }
    }

    // Thread-safe drain() method
    public synchronized void drain()  {
        logger.info("Thread {} is trying to drain.", Thread.currentThread().getId());
        if (!empty && boiled) {
            empty = true;
            logger.info("Thread {} is draining the boiled chocolate and milk.", Thread.currentThread().getId());
        } else if (empty) {
            logger.error("Thread {} finds the boiler empty; nothing to drain.", Thread.currentThread().getId());
        } else {
            logger.error("Thread {} finds the contents are not boiled; cannot drain.", Thread.currentThread().getId());
        }
    }

}
