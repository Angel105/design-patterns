package com.example.design_patterns;

import com.example.design_patterns.proxy.GumballMachine;
import com.example.design_patterns.proxy.GumballMonitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }
        count = Integer.parseInt(args[1]);

        SpringApplication.run(DesignPatternsApplication.class, args);

        GumballMachine gumballMachine = new GumballMachine(args[0],count);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);

        logger.info("{}", gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        logger.info("{}", gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        logger.info("{}", gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        logger.info("{}", gumballMachine);

        gumballMachine.insertQuarter();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        logger.info("{}", gumballMachine);

        gumballMachine.refill(5);
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();

        logger.info("{}", gumballMachine);
        monitor.report();
    }
}
