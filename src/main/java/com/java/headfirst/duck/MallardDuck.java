package com.java.headfirst.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackSound();
    }

    @Override
    public void display() {
        log.info("This is mallard duck");
    }
}
