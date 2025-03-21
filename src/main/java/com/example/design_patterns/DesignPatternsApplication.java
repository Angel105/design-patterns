package com.example.design_patterns;

import com.example.design_patterns.proxy.GumballMachine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;


@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }

        SpringApplication.run(DesignPatternsApplication.class, args);

        GumballMachine gumballMachine = null;
        try {

            // Start RMI registry on port 1099
            LocateRegistry.createRegistry(1099);

            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0],count);
            Naming.rebind("//" + args[0] + "/gumballmachine", gumballMachine);
            logger.info("\nGumballMachine bound to RMI registry.");
        } catch (Exception e) {
            logger.error("{}", e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
