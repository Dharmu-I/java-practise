package com.java.practise.design.decorator;

public class VegDelicious extends Pizza {

    VegDelicious(){
        pizzaName = "VegDelicious";
    }

    @Override
    public int getCost() {
        return 250;
    }
}
