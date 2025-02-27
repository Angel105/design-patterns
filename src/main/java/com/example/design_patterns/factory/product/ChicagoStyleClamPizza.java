package com.example.design_patterns.factory.product;

import com.example.design_patterns.factory.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStyleClamPizza extends Pizza {

    private static final Logger logger = LoggerFactory.getLogger(ChicagoStyleClamPizza.class);

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    @Override
    public void cut() {
        logger.info("Cutting the pizza into square slices");
    }
}
