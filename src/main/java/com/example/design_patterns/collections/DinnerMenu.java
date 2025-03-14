package com.example.design_patterns.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DinnerMenu {

    private final static Logger logger = LoggerFactory.getLogger(DinnerMenu.class);

    static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Vegetarian BLT", "Fake Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
        addItem("Steamed Veggies and Brown Rice", "Steamed Brussel sprout, broccoli , cauliflower and brown rice ", true, 2.05);
        addItem("Pasta", "Pasta with cauliflower and peas",  true, 1.05);
    }

    public void addItem(MenuItem menuItem) {
        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            logger.error("Sorry, menu is full! Can't add item to menu");
        } else {
            MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            addItem(menuItem);
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }

    // other methods
}
