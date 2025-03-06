package com.example.design_patterns.command;

import com.example.design_patterns.command.impl.NoCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class RemoteControl {

    private static final Logger logger = LoggerFactory.getLogger(RemoteControl.class);

    public static final int NUMBER_OF_SLOTS = 7;
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[NUMBER_OF_SLOTS];
        offCommands = new Command[NUMBER_OF_SLOTS];

        Command noCommand = new NoCommand();
        for (int i = 0; i < NUMBER_OF_SLOTS; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }

        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < NUMBER_OF_SLOTS; i++) {
            buff.append(String.format(
                            "[slot %d] %-25s %-25s%n", // Formatting string: %-25s ensures a fixed-width field
                            i,
                            onCommands[i].getClass().getSimpleName(),
                            offCommands[i].getClass().getSimpleName()
                    )
            );
        }
        buff.append("[undo] " + undoCommand.getClass().getSimpleName() + "\n");
        return buff.toString();
    }

}
