package com.dodo.lab.head_first_design_patterns.decorator.starbuzzWithSizes;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}

