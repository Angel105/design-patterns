package com.example.design_patterns.collections.composite.menuiterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;

public class Waitress {

    private final static Logger logger = LoggerFactory.getLogger(Waitress.class);

    private final MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }

    public void printVeganMenu() {
        Iterator<MenuComponent> iterator = allMenus.createIterator();
        logger.info("\nVEGAN MENU\n-----");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    }
}
