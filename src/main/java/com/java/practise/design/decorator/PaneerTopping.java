package com.java.practise.design.decorator;

public class PaneerTopping extends Topping {

    Pizza pizza;

    public PaneerTopping(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with Paneer";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+50;
    }
}
