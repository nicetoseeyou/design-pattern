package com.dodo.lab.head_first_design_patterns.command.undo;

public interface Command {
    public void execute();

    public void undo();
}
