package com.example.design_patterns.command.party.impl;

import com.example.design_patterns.command.party.Command;
import com.example.design_patterns.command.party.receiver.Hottub;

public class HottubOnCommand implements Command {
	private final Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.setTemperature(104);
		hottub.jetsOn();
		hottub.circulate();
	}
	public void undo() {
		hottub.off();
	}
}
