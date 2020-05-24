package com.java.headfirst.adventuregame;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SwordBehaviour implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        log.info("Using sword");
    }
}
