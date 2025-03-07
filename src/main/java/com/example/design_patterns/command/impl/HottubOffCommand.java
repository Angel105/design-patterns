package com.example.design_patterns.command.impl;

import com.example.design_patterns.command.Command;
import com.example.design_patterns.command.receiver.Hottub;

public class HottubOffCommand implements Command {
	private final Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.jetsOff();
		hottub.setTemperature(98);
		hottub.off();
	}
	public void undo() {
		hottub.on();
	}
}
