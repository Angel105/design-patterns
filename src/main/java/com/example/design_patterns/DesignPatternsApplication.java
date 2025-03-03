package com.example.design_patterns;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaStore;
import com.example.design_patterns.factory.store.ChicagoPizzaStore;
import com.example.design_patterns.factory.store.NYPizzaStore;
import com.example.design_patterns.singleton.Singleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        Singleton singleton = Singleton.getInstance();
        logger.info(singleton.getDescription());
    }

}
