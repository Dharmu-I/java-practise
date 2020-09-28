package com.java.design.decorator;

public abstract class Pizza {

    protected String description = "Unknown pizza";

    public abstract Integer getCost();

    public String getDescription() {
        return description;
    }
}
