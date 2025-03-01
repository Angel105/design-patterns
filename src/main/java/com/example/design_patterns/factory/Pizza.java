package com.example.design_patterns.factory;

import com.example.design_patterns.factory.ingredient.*;
import com.example.design_patterns.factory.strategy.CuttingStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Pizza {

    private static final Logger logger = LoggerFactory.getLogger(Pizza.class);

    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[] = {};
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;
    protected CuttingStrategy cuttingStrategy;

    public Pizza(String name, CuttingStrategy cuttingStrategy) {
        this.name = name;
        this.cuttingStrategy = cuttingStrategy;
    }

    public abstract void prepare();

    public void bake() {
        logger.info("Baking '{}' for 25 minutes at 350", name);
    }
    public void cut() {
        if (cuttingStrategy != null) {
            cuttingStrategy.cut(name);
        }
    }
    public void box() {
        logger.info("Placing '{}' in official PizzaStore box", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizza: ").append(name);
        if (dough != null) sb.append(", Dough: ").append(dough);
        if (sauce != null) sb.append(", Sauce: ").append(sauce);
        if (cheese != null) sb.append(", Cheese: ").append(cheese);
        if (veggies.length > 0) sb.append(", Veggies: ").append(listVeggies());
        if (clams != null) sb.append(", Clams: ").append(clams);
        if (pepperoni != null) sb.append(", Pepperoni: ").append(pepperoni);

        return sb.toString();
    }

    private StringBuilder listVeggies() {
        StringBuilder sb = new StringBuilder();
        sb.append(" [");
        String str;
        for (int i = 0; i < veggies.length - 1; i++) {
            str = veggies[i].toString();
            sb.append(str).append(", ");
        }
        str = veggies[veggies.length - 1].toString();
        sb.append(str).append("] ");
        return sb;
    }
}
