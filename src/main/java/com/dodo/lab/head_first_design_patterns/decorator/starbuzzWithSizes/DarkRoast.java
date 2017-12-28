package com.dodo.lab.head_first_design_patterns.decorator.starbuzzWithSizes;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}

