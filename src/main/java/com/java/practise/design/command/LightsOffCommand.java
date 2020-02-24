package com.java.practise.design.command;

public class LightsOffCommand implements Command{
    Lights lights;

    LightsOffCommand(Lights lights){
        this.lights = lights;
    }

    @Override
    public void execute() {
        this.lights.off();
    }
}
