package com.java.design.comparable;

import lombok.Getter;

@Getter
public class Duck implements Comparable {

    private int weight;

    public Duck(int weight) {
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        Duck duck = (Duck) o;
        if (duck.getWeight() > this.weight) {
            return -1;
        } else if (duck.getWeight() == this.getWeight()) {
            return 0;
        } else {
            return 1;
        }
    }
}
