package com.example.design_patterns.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {

    private List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
        final String menuName = "BREAKFAST: ";
        addItem(menuName, "K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem(menuName, "Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem(menuName, "Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem(menuName, "Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);

    }

    public void addItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }
    public void addItem(String menuName, String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(menuName, name, description, vegetarian, price);
        addItem(menuItem);
    }
    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }

    // other menu methods here
}
