package com.dodo.lab.head_first_design_patterns.strategy;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I'm flying with a rocket");
    }
}
