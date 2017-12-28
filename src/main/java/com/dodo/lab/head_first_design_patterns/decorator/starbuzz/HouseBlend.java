package com.dodo.lab.head_first_design_patterns.decorator.starbuzz;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}

