package com.java.headfirst.observer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentCondition implements Observer {

    private Subject weatherData;

    public CurrentCondition(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(Integer temperature, Integer humidity) {
        System.out.println("Current temperature "+temperature+" and humidity "+ humidity);
    }
}
