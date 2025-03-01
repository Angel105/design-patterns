package com.example.design_patterns.factory.store;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaIngredientFactory;
import com.example.design_patterns.factory.PizzaStore;
import com.example.design_patterns.factory.factory_impl.ChicagoPizzaIngredientFactory;
import com.example.design_patterns.factory.product.*;
import com.example.design_patterns.factory.strategy.CuttingStrategy;
import com.example.design_patterns.factory.strategy.impl.ChicagoCuttingStrategy;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        CuttingStrategy chicagoCuttingStrategy = new ChicagoCuttingStrategy();
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza(ingredientFactory, "Chicago Style Cheese Pizza", chicagoCuttingStrategy);
            case "pepperoni" -> new PepperoniPizza(ingredientFactory, "Chicago Style Pepperoni Pizza", chicagoCuttingStrategy);
            case "clam" -> new ClamPizza(ingredientFactory, "Chicago Style Clam Pizza", chicagoCuttingStrategy);
            case "veggie" -> new VeggiePizza(ingredientFactory, "Chicago Style Veggie Pizza", chicagoCuttingStrategy);
            default -> null;
        };

        if (pizza == null) {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }

        return pizza;
    }
}
