package com.example.design_patterns.command;

/**
 * The SimpleRemoteControl class is a simple implementation of a remote control
 * based on the Command design pattern. It allows a single command to be set
 * and invoked by pressing a button.
 *
 * This class maintains a reference to a Command object and triggers
 * the execution of the command upon user interaction.
 */
public class SimpleRemoteControl {
    Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
