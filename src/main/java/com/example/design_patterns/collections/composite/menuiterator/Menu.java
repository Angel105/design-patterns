package com.example.design_patterns.collections.composite.menuiterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Menu extends MenuComponent {

    private static final Logger logger = LoggerFactory.getLogger(Menu.class);
    private Iterator<MenuComponent> iterator = null;
    private List<MenuComponent> menuComponents = new ArrayList<>();
    private final String name;
    private final String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public Iterator createIterator() {
        if (iterator == null) {
            iterator = new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }

    @Override
    public void print() {
        logger.info("\n{}, {}\n-----------------------------", getName(), getDescription());
        for (MenuComponent menuComponent : menuComponents) {
            menuComponent.print();
        }
    }
}
