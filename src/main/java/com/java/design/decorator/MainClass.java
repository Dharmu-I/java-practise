package com.java.design.decorator;

public class MainClass {

    public static void main(String[] args) {
        Pizza pizza = new FarmHouse();
        System.out.println(pizza.getDescription()+" cost : "+pizza.getCost());

        pizza = new Paneer(pizza);
        System.out.println(pizza.getDescription()+" cost : "+pizza.getCost());
    }
}
