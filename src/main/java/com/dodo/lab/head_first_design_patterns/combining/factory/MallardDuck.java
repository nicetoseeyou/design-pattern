package com.dodo.lab.head_first_design_patterns.combining.factory;

public class MallardDuck implements Quackable {

    public void quack() {
        System.out.println("Quack");
    }

    public String toString() {
        return "Mallard Duck";
    }
}
