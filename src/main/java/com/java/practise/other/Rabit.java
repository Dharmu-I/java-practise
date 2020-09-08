package com.java.practise.other;

import lombok.Builder;

//@Builder
public class Rabit extends Animal{
    String color;

    @Builder
    public Rabit(String name, String color) {
        super(name);
        this.color = color;
    }
}
