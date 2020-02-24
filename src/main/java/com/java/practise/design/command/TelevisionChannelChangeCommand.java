package com.java.practise.design.command;

public class TelevisionChannelChangeCommand implements Command {
    Television television;

    TelevisionChannelChangeCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.channelChange();
    }
}
