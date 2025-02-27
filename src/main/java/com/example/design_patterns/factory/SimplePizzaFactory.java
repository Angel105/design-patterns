package com.example.design_patterns.factory;

import com.example.design_patterns.factory.product.CheesePizza;
import com.example.design_patterns.factory.product.ClamPizza;
import com.example.design_patterns.factory.product.PepperoniPizza;
import com.example.design_patterns.factory.product.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = switch (type) {
            case "cheese" -> new CheesePizza();
            case "pepperoni" -> new PepperoniPizza();
            case "clam" -> new ClamPizza();
            case "veggie" -> new VeggiePizza();
            default -> null;
        };

        return pizza;
    }
}
