package com.java.practise.design.command;

public class MainClass {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Lights lights = new Lights();
        Television television = new Television();
        remoteControl.setCommand(new LightsOnCommand(lights));
        remoteControl.control();
        remoteControl.setCommand(new LightsOffCommand(lights));
        remoteControl.control();
        remoteControl.setCommand(new TelevisionOnCommand(television));
        remoteControl.control();
        remoteControl.setCommand(new TelevisionOffCommand(television));
        remoteControl.control();
        remoteControl.setCommand(new TelevisionChannelChangeCommand(television));
        remoteControl.control();
    }
}
