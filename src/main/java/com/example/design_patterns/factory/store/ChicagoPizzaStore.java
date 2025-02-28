package com.example.design_patterns.factory.store;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaIngredientFactory;
import com.example.design_patterns.factory.PizzaStore;
import com.example.design_patterns.factory.factory_impl.ChicagoPizzaIngredientFactory;
import com.example.design_patterns.factory.product.*;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza(ingredientFactory, "Chicago Style Cheese Pizza");
            case "pepperoni" -> new PepperoniPizza(ingredientFactory, "Chicago Style Pepperoni Pizza");
            case "clam" -> new ClamPizza(ingredientFactory, "Chicago Style Clam Pizza");
            case "veggie" -> new VeggiePizza(ingredientFactory, "Chicago Style Veggie Pizza");
            default -> null;
        };

        if (pizza == null) {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }

        return pizza;
    }
}
