package com.example.design_patterns.command.impl;

import com.example.design_patterns.command.Command;
import com.example.design_patterns.command.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {

    private final Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
}
