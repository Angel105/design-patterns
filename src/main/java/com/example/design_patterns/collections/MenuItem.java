package com.example.design_patterns.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MenuItem extends MenuComponent {

    private static  final Logger logger = LoggerFactory.getLogger(MenuItem.class);

    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        logger.info(" {} {}, ${}", getName(), isVegetarian() ? "(v)" : "", getPrice());
        logger.info("    -- {} ", getDescription());
    }

}
