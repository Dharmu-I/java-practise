package com.java.headfirst.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SqueakSound implements QuackBehavior{
    @Override
    public void quack() {
        log.info("Make squeak sound");
    }
}
