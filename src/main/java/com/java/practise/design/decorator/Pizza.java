package com.java.practise.design.decorator;

public abstract class Pizza {
    public String pizzaName = "Unknown";
    public String getDescription(){
        return pizzaName;
    }
    public abstract int getCost();
}
