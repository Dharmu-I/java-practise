package com.java.design.templatemethod;

public abstract class CaffeineBeverage {

    final void prepare() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Poured water into cup");
    }

    private void boilWater() {
        System.out.println("Kept water for boiling");
    }
}
