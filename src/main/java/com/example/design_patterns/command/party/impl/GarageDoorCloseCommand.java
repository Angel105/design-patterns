package com.example.design_patterns.command.party.impl;

import com.example.design_patterns.command.party.Command;
import com.example.design_patterns.command.party.receiver.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.down();
    }

    @Override
    public void undo() {
        garageDoor.up();
    }
}
