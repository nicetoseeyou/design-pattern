package com.dodo.designPattern.Strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super();
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck!");
    }

}
