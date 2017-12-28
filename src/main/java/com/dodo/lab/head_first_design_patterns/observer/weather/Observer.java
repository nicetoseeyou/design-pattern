package com.dodo.lab.head_first_design_patterns.observer.weather;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
