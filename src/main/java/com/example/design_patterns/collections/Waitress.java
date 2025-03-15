package com.example.design_patterns.collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Waitress {

    private final static Logger logger = LoggerFactory.getLogger(Waitress.class);

    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinnerMenu dinnerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();
        logger.info("\nMENU\n----\nBREAKFAST");
        printMenu(pancakeIterator);
        logger.info("\nLUNCH");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem item = iterator.next();
            logger.info("{}, ${} -- {}", item.getName(), item.getPrice(), item.getDescription());
        }
    }
}
