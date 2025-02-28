package com.example.design_patterns.factory.store;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaIngredientFactory;
import com.example.design_patterns.factory.PizzaStore;
import com.example.design_patterns.factory.factory_impl.NYPizzaIngredientFactory;
import com.example.design_patterns.factory.product.*;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza(ingredientFactory, "NY Style Sauce and Cheese Pizza");
            case "pepperoni" -> new PepperoniPizza(ingredientFactory, "New York Style Pepperoni Pizza");
            case "clam" -> new ClamPizza(ingredientFactory, "New York Style Clam Pizza");
            case "veggie" -> new VeggiePizza(ingredientFactory, "New York Style Veggie Pizza");
            default -> null;
        };

        if (pizza == null) {
            throw new IllegalArgumentException("Unknown pizza type: " + type);
        }

        return pizza;
    }
}
