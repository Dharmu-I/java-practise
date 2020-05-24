package com.java.headfirst.duck;

import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.BasicConfigurator;

@Slf4j
public class MiniDuckSimulator {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.makeSound();
        mallardDuck.performFly();
    }
}
