package com.dodo.lab.head_first_design_patterns.decorator.starbuzzWithSizes;

public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;

    public abstract String getDescription();

    public Size getSize() {
        return beverage.getSize();
    }
}
