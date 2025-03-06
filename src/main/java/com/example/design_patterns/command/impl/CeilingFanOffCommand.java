package com.example.design_patterns.command.impl;

import com.example.design_patterns.command.Command;
import com.example.design_patterns.command.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {

    private final CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
