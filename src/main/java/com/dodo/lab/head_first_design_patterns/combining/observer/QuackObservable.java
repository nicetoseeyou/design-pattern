package com.dodo.lab.head_first_design_patterns.combining.observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);

    public void notifyObservers();
}
