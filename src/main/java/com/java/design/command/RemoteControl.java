package com.java.design.command;

import com.java.practise.design.command.Command;

public class RemoteControl {

    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void control(){
        this.command.execute();
    }
}
