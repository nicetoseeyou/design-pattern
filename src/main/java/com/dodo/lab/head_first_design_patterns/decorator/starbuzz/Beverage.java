package com.dodo.lab.head_first_design_patterns.decorator.starbuzz;

public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
