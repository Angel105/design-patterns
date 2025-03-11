package com.example.design_patterns;

import com.example.design_patterns.templatemethod.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);
        InputHandler inputHandler = new ConsoleInputHandler();
        CaffeineBeverageWithHook tea = new TeaWithHook(inputHandler);
        CaffeineBeverageWithHook coffee = new CoffeeWithHook(inputHandler);

        logger.info("\nMaking tea...");
        tea.prepareRecipe();

        logger.info("\nMaking coffee...");
        coffee.prepareRecipe();

    }
}
