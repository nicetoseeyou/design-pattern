package com.dodo.lab.head_first_design_patterns.combining.composite;

public class RedheadDuck implements Quackable {
    public void quack() {
        System.out.println("Quack");
    }

    public String toString() {
        return "Redhead Duck";
    }
}
