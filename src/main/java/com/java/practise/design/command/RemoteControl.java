package com.java.practise.design.command;

public class RemoteControl {
    Command remote;

    public void setCommand(Command command) {
        remote = command;
    }

    public void control() {
        remote.execute();
    }
}
