package com.java.design.templatemethod;

public class MainClass {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.prepare();

        Tea tea = new Tea();
        tea.prepare();
    }
}
