package com.dodo.lab.head_first_design_patterns.singleton.stat;

public class SingletonClient {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.getDescription());
    }
}
