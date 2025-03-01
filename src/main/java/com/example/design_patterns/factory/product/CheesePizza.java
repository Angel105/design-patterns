package com.example.design_patterns.factory.product;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaIngredientFactory;
import com.example.design_patterns.factory.factory_impl.ChicagoPizzaIngredientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CheesePizza extends Pizza {

    private static final Logger logger = LoggerFactory.getLogger(CheesePizza.class);

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory, String name) {
        this.name = name;
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        logger.info("Preparing {}", name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

    @Override
    public void cut() {
        if (ingredientFactory instanceof ChicagoPizzaIngredientFactory) {
            logger.info("Cutting '{}' into square slices", name);
        } else {
            super.cut();
        }
    }
}
