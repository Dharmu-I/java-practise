package com.java.headfirst.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MuteSound implements QuackBehavior {
    @Override
    public void quack() {
        log.info("Not makes any sound");
    }
}
