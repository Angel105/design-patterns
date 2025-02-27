package com.example.design_patterns.factory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    private static final Logger logger = LoggerFactory.getLogger(Pizza.class);

    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        logger.info("Preparing {}", name);
        logger.info("Tossing dough...");
        logger.info("Adding sauce...");
        logger.info("Adding toppings: {}", listToppings());
    }
    public void bake() {
        logger.info("Baking '{}' for 25 minutes at 350", name);
    }
    public void cut() {
        logger.info("Cutting '{}' into diagonal slices", name);
    }
    public void box() {
        logger.info("Placing '{}' in official PizzaStore box", name);
    }

    @Override
    public String toString() {
        String s = "Pizza: " + name + ", " +
                "Dough: " + dough + ", " +
                "Sauce: " + sauce + ", " +
                "Toppings: " + listToppings();
        return s;
    }

    private StringBuilder listToppings() {
        StringBuilder sb = new StringBuilder();
        String topping;
        for (int i = 0; i < toppings.size() - 1; i++) {
            topping = toppings.get(i);
            sb.append(topping).append(", ");
        }
        topping = toppings.get(toppings.size() - 1);
        sb.append(topping);
        return sb;
    }
}
