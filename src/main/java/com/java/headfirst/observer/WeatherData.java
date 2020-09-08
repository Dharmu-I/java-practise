package com.java.headfirst.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    List<Observer> observers = new ArrayList<>();
    Integer temperature;
    Integer humidity;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(this.temperature, this.humidity);
        }
    }

    public void changeInTemperature(Integer temperature, Integer humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObserver();
    }
}
