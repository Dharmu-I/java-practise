package com.java.practise.trail;

public class PizzaMainClass {

    public static void main(String[] args) {
        Pizza farmHousePizza = new FarmHousePizza();
        System.out.println(farmHousePizza.getDescription());
        farmHousePizza = new CornTopping(farmHousePizza);
        System.out.println(farmHousePizza.getDescription());
    }

}
