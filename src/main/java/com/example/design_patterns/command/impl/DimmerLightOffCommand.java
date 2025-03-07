package com.example.design_patterns.command.impl;

import com.example.design_patterns.command.Command;
import com.example.design_patterns.command.receiver.Light;

public class DimmerLightOffCommand implements Command {
	private final Light light;
	private int prevLevel;

	public DimmerLightOffCommand(Light light) {
		this.light = light;
		prevLevel = 100;
	}

	public void execute() {
		prevLevel = light.getLevel();
		light.off();
	}

	public void undo() {
		light.dim(prevLevel);
	}
}
