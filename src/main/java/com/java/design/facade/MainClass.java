package com.java.design.facade;

public class MainClass {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
