package com.java.design.facade;

public class HomeTheaterFacade {

    private Amplifier amplifier;
    private Light light;
    private Projector projector;

    public HomeTheaterFacade() {
        this.amplifier = new Amplifier();
        this.light = new Light();
        this.projector = new Projector();
    }

    public void watchMovie() {
        System.out.println("===== Movie starting ====");
        this.amplifier.on();
        this.light.off();
        this.projector.on();
        this.amplifier.setVolume(10);
        System.out.println("=========================\n\n");
    }

    public void endMovie() {
        System.out.println("===== Movie ending ====");
        this.amplifier.off();
        this.light.on();
        this.projector.off();
        System.out.println("=========================\n\n");
    }
}
