package com.example.design_patterns;

import com.example.design_patterns.singleton.chocolate.ChocolateBoiler;
import com.example.design_patterns.singleton.classic.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        Singleton singleton = Singleton.getInstance();
        logger.info(singleton.getDescription());

        List<Thread> threads = new ArrayList<>();

        // Test : Singleton thread-safe creation test
        for (int i = 0; i < 10; i++) {
            Thread creationThread = new Thread(() -> {
                ChocolateBoiler instance = ChocolateBoiler.UNIQUE_INSTANCE; // Inside lambda
                instance.fill();

                try {
                    Thread.sleep((int) (Math.random() * 300)); // Random simulated delay
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                instance.boil();
                instance.drain();
            });
            threads.add(creationThread); // Add thread to the list
            creationThread.start();
        }

        // Ensure all threads complete
        for (Thread thread : threads) {
            try {
                thread.join(); // Wait for each thread to finish
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }

}
