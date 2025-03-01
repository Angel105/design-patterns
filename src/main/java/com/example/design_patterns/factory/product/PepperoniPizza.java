package com.example.design_patterns.factory.product;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaIngredientFactory;
import com.example.design_patterns.factory.factory_impl.ChicagoPizzaIngredientFactory;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class PepperoniPizza extends Pizza {

    private static final Logger logger = LoggerFactory.getLogger(PepperoniPizza.class);

    PizzaIngredientFactory ingredientFactory;
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory, String name) {
        this.name = name;
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        logger.info("Preparing {}", name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies= ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
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
