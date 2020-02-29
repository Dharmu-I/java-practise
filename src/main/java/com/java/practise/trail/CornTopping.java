package com.java.practise.trail;

public class CornTopping extends Topping {

    Pizza pizza;

    CornTopping(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String description() {
        return pizza.getDescription()+" corn topping";
    }
}
