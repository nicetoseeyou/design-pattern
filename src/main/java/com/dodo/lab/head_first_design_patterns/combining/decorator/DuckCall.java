package com.dodo.lab.head_first_design_patterns.combining.decorator;

public class DuckCall implements Quackable {

    public void quack() {
        System.out.println("Kwak");
    }

    public String toString() {
        return "Duck Call";
    }
}
