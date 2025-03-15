package com.example.design_patterns.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Iterator;
import java.util.List;

public class Waitress {

    private final static Logger logger = LoggerFactory.getLogger(Waitress.class);

    private final List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<Menu> menuIterator = menus.iterator();
        logger.info("\nMENU\n----");
        while (menuIterator.hasNext()) {
            Menu menu = menuIterator.next();
            printMenu(menu.createIterator());
        }
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            logger.info("{} {}, ${} -- {}", item.getMenuName(), item.getName(), item.getPrice(), item.getDescription());
        }
    }
}
