package com.example.design_patterns.collections;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinnerMenuIterator implements Iterator<MenuItem> {
    private final MenuItem[] items;
    private int position;

    public AlternatingDinnerMenuIterator(MenuItem[] items) {
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        }
        return true;
    }

    @Override
    public MenuItem next() {
        MenuItem menuItem = items[position];
        position = position + 2;
        return menuItem;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("You shouldn't be trying to remove menu items.");
    }
}
