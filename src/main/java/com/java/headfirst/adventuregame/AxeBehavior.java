package com.java.headfirst.adventuregame;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AxeBehavior implements WeaponBehaviour {
    @Override
    public void useWeapon() {
        log.info("Using the axe");
    }
}
