package com.java.practise.design.command;

public class LightsOnCommand implements Command {

    Lights lights;

    LightsOnCommand(Lights lights) {
        this.lights = lights;
    }

    @Override
    public void execute() {
        this.lights.on();
    }
}
