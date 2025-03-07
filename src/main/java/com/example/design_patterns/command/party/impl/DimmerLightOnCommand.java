package com.example.design_patterns.command.party.impl;

import com.example.design_patterns.command.party.Command;
import com.example.design_patterns.command.party.receiver.Light;

public class DimmerLightOnCommand implements Command {
	private final Light light;
	private int prevLevel;

	public DimmerLightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.dim(75);
	}

	public void undo() {
		light.dim(prevLevel);
	}
}
