package com.example.design_patterns.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Iterator;

public class Waitress {

    private final static Logger logger = LoggerFactory.getLogger(Waitress.class);

    private final Menu pancakeHouseMenu;
    private final Menu dinnerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
        logger.info("\nMENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        logger.info("\nLUNCH");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            logger.info("{}, ${} -- {}", item.getName(), item.getPrice(), item.getDescription());
        }
    }
}
