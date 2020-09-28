package com.java.design.facade;

public class Amplifier {

    public void on() {
        System.out.println("Projector on");
    }

    public void off() {
        System.out.println("Projector off");
    }

    public void setVolume(int volume) {
        System.out.println("Volume of amplifier set to " + volume);
    }
}
