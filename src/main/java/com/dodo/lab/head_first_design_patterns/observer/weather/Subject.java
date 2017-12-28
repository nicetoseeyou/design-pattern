package com.dodo.lab.head_first_design_patterns.observer.weather;

public interface Subject {
    void registerObserver(com.dodo.lab.head_first_design_patterns.observer.weather.Observer o);

    void removeObserver(com.dodo.lab.head_first_design_patterns.observer.weather.Observer o);

    void notifyObservers();
}
