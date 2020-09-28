package com.java.design.command;

public class MailClass {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(new LightOnCommand(new Light()));
        remoteControl.control();
        remoteControl.setCommand(new LightOffCommand(new Light()));
        remoteControl.control();
    }
}
