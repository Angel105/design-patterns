package com.example.design_patterns;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaStore;
import com.example.design_patterns.factory.store.ChicagoStylePizzaStore;
import com.example.design_patterns.factory.store.NYStylePizzaStore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        PizzaStore nyStore  = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza;

        pizza = nyStore.orderPizza("cheese");
        logger.info("Ethan ordered a {}", pizza);

        pizza = chicagoStore.orderPizza("cheese");
        logger.info("Joel ordered a {}", pizza);

        pizza = nyStore.orderPizza("clam");
        logger.info("Ethan ordered a {}", pizza);

        pizza = chicagoStore.orderPizza("clam");
        logger.info("Joel ordered a {}", pizza);

        pizza = nyStore.orderPizza("pepperoni");
        logger.info("Ethan ordered a {}", pizza);

        pizza = chicagoStore.orderPizza("pepperoni");
        logger.info("Joel ordered a {}", pizza);

        pizza = nyStore.orderPizza("veggie");
        logger.info("Ethan ordered a {}", pizza);

        pizza = chicagoStore.orderPizza("veggie");
        logger.info("Joel ordered a {}", pizza);
    }


}
