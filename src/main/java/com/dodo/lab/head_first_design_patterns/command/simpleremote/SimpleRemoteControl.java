package com.dodo.lab.head_first_design_patterns.command.simpleremote;

//
// This is the invoker
//
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
