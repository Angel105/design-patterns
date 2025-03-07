package com.example.design_patterns.command.impl;

import com.example.design_patterns.command.Command;
import com.example.design_patterns.command.receiver.TV;

public class TVOffCommand implements Command {
	private final TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}

	public void execute() {
		tv.off();
	}

	public void undo() {
		tv.on();
	}
}
