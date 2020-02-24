package com.java.practise.design.command;

public class TelevisionOffCommand implements Command {

    Television television;

    TelevisionOffCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.off();
    }
}
