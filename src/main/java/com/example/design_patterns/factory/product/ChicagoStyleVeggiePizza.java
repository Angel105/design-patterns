package com.example.design_patterns.factory.product;

import com.example.design_patterns.factory.Pizza;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ChicagoStyleVeggiePizza extends Pizza {

    private static final Logger logger = LoggerFactory.getLogger(ChicagoStyleVeggiePizza.class);

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Black Olives");
        toppings.add("Spinach");
        toppings.add("Eggplant");
    }

    @Override
    public void cut() {
        logger.info("Cutting the pizza into square slices");
    }
}
