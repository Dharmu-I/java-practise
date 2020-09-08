package com.java.headfirst.observer;

public class StaticDisplay implements Observer {

    private Subject subject;

    public StaticDisplay(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(Integer temperature, Integer humidity) {
        System.out.println("Static display Current temperature "+temperature+" and humidity "+ humidity);
    }
}
