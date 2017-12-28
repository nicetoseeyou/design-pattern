package com.dodo.lab.head_first_design_patterns.adapter.ducks;

public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}
