package com.example.design_patterns.templatemethod.list;

import java.util.AbstractList;

public class MyStringList extends AbstractList<String> {

    private final String[] myList;

    public MyStringList(String[] strings) {
        this.myList = strings;
    }

    @Override
    public String get(int index) {
        return myList[index];
    }

    @Override
    public int size() {
        return myList.length;
    }

    @Override
    public String set(int index, String value) {
        String oldValue = myList[index];
        myList[index] = value;
        return oldValue;
    }
}
