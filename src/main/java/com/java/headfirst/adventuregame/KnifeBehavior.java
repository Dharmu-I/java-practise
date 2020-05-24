package com.java.headfirst.adventuregame;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class KnifeBehavior implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        log.info("Using knife");
    }
}
