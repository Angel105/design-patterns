package com.example.design_patterns.decorator.starbuzz;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
