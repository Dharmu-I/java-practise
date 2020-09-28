package com.java.design.iterator;

public class Item {
    private String name;

    private Integer value;

    public Item(String name, Integer value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
