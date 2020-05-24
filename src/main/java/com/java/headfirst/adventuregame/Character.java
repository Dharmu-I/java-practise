package com.java.headfirst.adventuregame;

public abstract class Character {

    protected WeaponBehaviour weaponBehaviour;

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void useWeapon(){
        weaponBehaviour.useWeapon();
    }

    public abstract void fight();
}
