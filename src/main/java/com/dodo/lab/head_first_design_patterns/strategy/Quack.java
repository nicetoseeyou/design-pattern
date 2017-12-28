package com.dodo.lab.head_first_design_patterns.strategy;

public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}
