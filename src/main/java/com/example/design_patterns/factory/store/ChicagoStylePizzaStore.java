package com.example.design_patterns.factory.store;

import com.example.design_patterns.factory.Pizza;
import com.example.design_patterns.factory.PizzaStore;
import com.example.design_patterns.factory.product.ChicagoStyleCheesePizza;
import com.example.design_patterns.factory.product.ChicagoStyleClamPizza;
import com.example.design_patterns.factory.product.ChicagoStylePepperoniPizza;
import com.example.design_patterns.factory.product.ChicagoStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = switch (type) {
            case "cheese" -> new ChicagoStyleCheesePizza();
            case "pepperoni" -> new ChicagoStylePepperoniPizza();
            case "clam" -> new ChicagoStyleClamPizza();
            case "veggie" -> new ChicagoStyleVeggiePizza();
            default -> null;
        };

        return pizza;
    }
}
