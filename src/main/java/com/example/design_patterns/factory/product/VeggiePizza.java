package com.example.design_patterns.factory.product;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaIngredientFactory;
import com.example.design_patterns.factory.strategy.CuttingStrategy;
import com.example.design_patterns.factory.strategy.impl.DefaultCuttingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VeggiePizza extends Pizza {

    private static final Logger logger = LoggerFactory.getLogger(VeggiePizza.class);

    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory, String name, CuttingStrategy cuttingStrategy) {
        super(name, cuttingStrategy);
        this.ingredientFactory = ingredientFactory;
    }

    public VeggiePizza(PizzaIngredientFactory ingredientFactory, String name) {
        super(name, new DefaultCuttingStrategy());
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        logger.info("Preparing {}", name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }

}
