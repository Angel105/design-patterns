package com.example.design_patterns.factory.product;

import com.example.design_patterns.factory.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStylePepperoniPizza extends Pizza {

    private static final Logger logger = LoggerFactory.getLogger(ChicagoStylePepperoniPizza.class);
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
        toppings.add("Sliced Pepperoni");
    }

    @Override
    public void cut() {
        logger.info("Cutting the pizza into square slices");
    }
}
