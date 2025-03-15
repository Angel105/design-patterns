package com.example.design_patterns.collections;
import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
