package com.example.design_patterns;

import com.example.design_patterns.templatemethod.CoffeeWithHook;
import com.example.design_patterns.templatemethod.ConsoleInputHandler;
import com.example.design_patterns.templatemethod.InputHandler;
import com.example.design_patterns.templatemethod.TeaWithHook;
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
        TeaWithHook tea = new TeaWithHook(inputHandler);
        CoffeeWithHook coffee = new CoffeeWithHook(inputHandler);

        logger.info("\nMaking tea...");
        tea.prepareRecipe();

        logger.info("\nMaking coffee...");
        coffee.prepareRecipe();

    }
}
