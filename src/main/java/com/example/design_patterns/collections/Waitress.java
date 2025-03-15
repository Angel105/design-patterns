package com.example.design_patterns.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Iterator;

public class Waitress {

    private final static Logger logger = LoggerFactory.getLogger(Waitress.class);

    private final Menu pancakeHouseMenu;
    private final Menu dinnerMenu;
    private final Menu cafeMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
        this.cafeMenu = cafeMenu;
    }

    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinnerIterator = dinnerMenu.createIterator();
        Iterator<MenuItem> cafeIterator = cafeMenu.createIterator();
        logger.info("\nMENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        logger.info("\nLUNCH");
        printMenu(dinnerIterator);
        logger.info("\nDINNER");
        printMenu(cafeIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            logger.info("{}, ${} -- {}", item.getName(), item.getPrice(), item.getDescription());
        }
    }
}
