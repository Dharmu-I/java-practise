package com.java.headfirst.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void makeSound(){
        quackBehavior.quack();
    }
}
