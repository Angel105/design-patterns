package com.example.design_patterns.factory.product;

import com.example.design_patterns.factory.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStyleCheesePizza extends Pizza {

    private static  final Logger logger = LoggerFactory.getLogger(ChicagoStyleCheesePizza.class);
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    public void cut() {
        logger.info("Cutting the pizza into square slices");
    }
}
