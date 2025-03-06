package com.example.design_patterns.command.impl;

import com.example.design_patterns.command.Command;
import com.example.design_patterns.command.GarageDoor;

public class GarageDoorCloseCommand implements Command {

    private final GarageDoor garageDoor;

    public GarageDoorCloseCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }


    @Override
    public void execute() {
        garageDoor.down();
    }
}
