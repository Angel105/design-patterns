package com.example.design_patterns.command.dinner.impl;

import com.example.design_patterns.command.dinner.Order;
import com.example.design_patterns.command.dinner.receiver.Cook;

public class BurgerAndFriesOrder implements Order {

    private final Cook cook;

    public BurgerAndFriesOrder(Cook cook) {
        this.cook = cook;
    }

    @Override
    public void orderUp() {
        cook.makeBurger();
        cook.makeFries();
    }

    @Override
    public String toString() {
        return "Burger And Fries";
    }
}
