package com.example.design_patterns.command.party.impl;

import com.example.design_patterns.command.party.Command;

public class NoCommand implements Command {
    @Override
    public void execute() { }

    @Override
    public void undo() { }
}
