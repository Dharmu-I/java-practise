package com.java.design.iterator;

public class MainClass {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addItem(new Item("Laado", 10));
        menu.addItem(new Item("Barfi", 100));
        menu.addItem(new Item("Soda", 80));
        while (menu.hasNext()) {
            System.out.println(menu.next().toString());
        }
    }
}
