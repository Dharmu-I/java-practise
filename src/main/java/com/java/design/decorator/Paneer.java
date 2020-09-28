package com.java.design.decorator;

public class Paneer extends PizzaDecorator {

    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() +", Panner topping";
    }

    @Override
    public Integer getCost() {
        return this.pizza.getCost()+5;
    }
}
