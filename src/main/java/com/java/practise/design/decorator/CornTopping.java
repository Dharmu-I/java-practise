package com.java.practise.design.decorator;

public class CornTopping extends Topping {

    Pizza pizza;

    public CornTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " corn topping";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 30;
    }
}
