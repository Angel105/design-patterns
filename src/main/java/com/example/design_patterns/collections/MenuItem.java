package com.example.design_patterns.collections;

public class MenuItem {
    private String menuName;
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;

    public MenuItem(String menuName, String name, String description, boolean vegetarian, double price) {
        this.menuName = menuName;
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

    public String getMenuName() {
        return menuName;
    }
}
