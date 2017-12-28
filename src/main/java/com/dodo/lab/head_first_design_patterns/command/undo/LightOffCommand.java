package com.dodo.lab.head_first_design_patterns.command.undo;

public class LightOffCommand implements Command {
    Light light;
    int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        level = light.getLevel();
        light.off();
    }

    public void undo() {
        light.dim(level);
    }
}
