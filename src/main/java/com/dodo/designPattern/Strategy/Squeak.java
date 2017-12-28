package com.dodo.designPattern.Strategy;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Sqeak!");
    }

}
