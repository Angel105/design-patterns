package com.example.design_patterns.decorator;

public abstract class Beverage {
    public enum Size { TALL, GRANDE, VENTI }
    public Size size = Size.TALL;
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
