package com.java.practise.design.decorator;

public class FarmHouse extends Pizza {

    FarmHouse(){
        pizzaName = "FarmHouse";
    }

    @Override
    public int getCost() {
        return 120;
    }
}
