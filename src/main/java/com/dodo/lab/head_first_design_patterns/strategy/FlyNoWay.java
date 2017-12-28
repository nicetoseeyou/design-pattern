package com.dodo.lab.head_first_design_patterns.strategy;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
