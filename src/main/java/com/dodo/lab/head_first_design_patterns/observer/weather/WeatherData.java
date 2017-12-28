package com.dodo.lab.head_first_design_patterns.observer.weather;

import java.util.*;

public class WeatherData implements Subject {
    private ArrayList<com.dodo.lab.head_first_design_patterns.observer.weather.Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(com.dodo.lab.head_first_design_patterns.observer.weather.Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(com.dodo.lab.head_first_design_patterns.observer.weather.Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (com.dodo.lab.head_first_design_patterns.observer.weather.Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
