package com.example.design_patterns.templatemethod.sort;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Duck implements Comparable<Duck> {

    private static final Logger logger = LoggerFactory.getLogger(Duck.class);

    private String name;
    private int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Duck otherDuck) {
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public String toString() {
        return name + " weights " + weight;
    }
}
