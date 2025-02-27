package com.example.design_patterns.factory.store;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaStore;
import com.example.design_patterns.factory.product.NYStyleCheesePizza;
import com.example.design_patterns.factory.product.NYStyleClamPizza;
import com.example.design_patterns.factory.product.NYStylePepperoniPizza;
import com.example.design_patterns.factory.product.NYStyleVeggiePizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = switch (type) {
            case "cheese" -> new NYStyleCheesePizza();
            case "pepperoni" -> new NYStylePepperoniPizza();
            case "clam" -> new NYStyleClamPizza();
            case "veggie" -> new NYStyleVeggiePizza();
            default -> null;
        };

        return pizza;
    }
}
