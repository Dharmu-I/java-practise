package com.java.design.adapter;

public class DuckAdapter implements Duck {

    Turkey turkey;

    public DuckAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        this.turkey.fly();
    }

    @Override
    public void quack() {
        this.turkey.gobble();
    }
}
