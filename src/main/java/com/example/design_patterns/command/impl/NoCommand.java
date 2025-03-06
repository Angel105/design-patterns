package com.example.design_patterns.command.impl;

import com.example.design_patterns.command.Command;

public class NoCommand implements Command {
    @Override
    public void execute() { }

    @Override
    public void undo() { }
}
