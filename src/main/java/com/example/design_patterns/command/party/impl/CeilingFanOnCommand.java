package com.example.design_patterns.command.party.impl;

import com.example.design_patterns.command.party.Command;
import com.example.design_patterns.command.party.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {

    private final CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
