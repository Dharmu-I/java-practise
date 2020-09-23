package com.java.design;

public class FarmHouse extends Pizza {

    public FarmHouse() {
        this.description = "Farmhouse pizza";
    }

    @Override
    public Integer getCost() {
        return 30;
    }
}
