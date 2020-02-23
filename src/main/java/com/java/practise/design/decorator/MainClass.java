package com.java.practise.design.decorator;

public class MainClass {

    public static void main(String[] args) {
        Pizza farmHouse = new FarmHouse();
        System.out.println(farmHouse.getDescription() + "\t"+ farmHouse.getCost());
        Pizza vegDelicious = new VegDelicious();
        System.out.println(vegDelicious.getDescription() + "\t"+vegDelicious.getCost());
        farmHouse = new PaneerTopping(farmHouse);
        System.out.println(farmHouse.getDescription() + "\t"+ farmHouse.getCost());
        vegDelicious = new CornTopping(vegDelicious);
        System.out.println(vegDelicious.getDescription() + "\t"+vegDelicious.getCost());
    }
}
