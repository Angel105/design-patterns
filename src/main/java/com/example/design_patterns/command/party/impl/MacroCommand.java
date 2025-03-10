package com.example.design_patterns.command.party.impl;

import com.example.design_patterns.command.party.Command;

public class MacroCommand implements Command {

    private final Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    /**
     * NOTE:  these commands have to be done backwards to ensure
     * proper undo functionality
     */
    @Override
    public void undo() {
        for (int i = commands.length - 1; i>=0; i--) {
            commands[i].undo();
        }
    }
}
