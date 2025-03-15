package com.example.design_patterns.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Iterator;

public class DinnerMenu implements Menu {

    private final static Logger logger = LoggerFactory.getLogger(DinnerMenu.class);

    static final int MAX_ITEMS = 6;
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinnerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        final String menuName = "LUNCH: ";
        addItem(menuName, "Vegetarian BLT", "Fake Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem(menuName, "BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem(menuName, "Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem(menuName, "Hotdog", "A hot dog, with saurkraut, relish, onions, topped with cheese", false, 3.05);
        addItem(menuName, "Steamed Veggies and Brown Rice", "Steamed Brussel sprout, broccoli , cauliflower and brown rice ", true, 2.05);
        addItem(menuName, "Pasta", "Pasta with cauliflower and peas",  true, 1.05);
    }

    public void addItem(MenuItem menuItem) {
        menuItems[numberOfItems] = menuItem;
        numberOfItems++;
    }

    public void addItem(String menuName, String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            logger.error("Sorry, menu is full! Can't add item to menu");
        } else {
            MenuItem menuItem = new MenuItem(menuName, name, description, vegetarian, price);
            addItem(menuItem);
        }
    }
    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinnerMenuIterator(menuItems);
    }

    // other methods
}
