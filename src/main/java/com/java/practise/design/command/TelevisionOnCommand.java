package com.java.practise.design.command;

public class TelevisionOnCommand implements Command {

    Television television;

    TelevisionOnCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.on();
    }
}
