package com.example.design_patterns.command;

@FunctionalInterface
public interface Command {
    public void execute();
    public void undo();
}
