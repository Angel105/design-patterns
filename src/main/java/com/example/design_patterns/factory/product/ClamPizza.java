package com.example.design_patterns.factory.product;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaIngredientFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClamPizza extends Pizza {
    private static final Logger logger = LoggerFactory.getLogger(ClamPizza.class);

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory, String name) {
        this.name = name;
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        logger.info("Preparing {}", name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese= ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
