package com.example.design_patterns.command.impl;

import com.example.design_patterns.command.Command;
import com.example.design_patterns.command.receiver.Light;

public class DimmerLightDownCommand implements Command {
    private final Light light;
    private int prevLevel;

    public DimmerLightDownCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        int curLevel = light.getLevel();
        int step = 5;
        if (curLevel - step >= 0) {
            light.dim(curLevel - step);
            prevLevel = curLevel;
        }
    }

    @Override
    public void undo() {
        light.dim(prevLevel);
    }
}
