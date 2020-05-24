package com.java.headfirst.adventuregame;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class King extends Character {

    King(){
        weaponBehaviour = new SwordBehaviour();
    }

    @Override
    public void fight() {
        log.info("King is fighting by ");
    }
}
