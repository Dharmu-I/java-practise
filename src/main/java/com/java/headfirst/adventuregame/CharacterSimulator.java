package com.java.headfirst.adventuregame;


import org.apache.log4j.BasicConfigurator;

public class CharacterSimulator {
    public static void main(String[] args) {
        BasicConfigurator.configure();
        King king = new King();
        king.fight();
        king.useWeapon();
    }
}
