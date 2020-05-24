package com.java.headfirst.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
      log.info("Not flying");
    }
}
