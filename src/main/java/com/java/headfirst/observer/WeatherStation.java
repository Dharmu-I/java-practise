package com.java.headfirst.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentCondition currentCondition = new CurrentCondition(weatherData);
        weatherData.changeInTemperature(10, 20);
    }
}
