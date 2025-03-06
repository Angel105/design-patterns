package com.example.design_patterns;

import com.example.design_patterns.command.impl.*;
import com.example.design_patterns.command.receiver.CeilingFan;
import com.example.design_patterns.command.receiver.GarageDoor;
import com.example.design_patterns.command.receiver.Light;
import com.example.design_patterns.command.RemoteControl;
import com.example.design_patterns.command.receiver.Stereo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        RemoteControl remote = new RemoteControl();
        CeilingFan ceilingFan = new CeilingFan("Living Room");

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remote.setCommand(0, ceilingFanLow, ceilingFanOff);
        remote.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remote.setCommand(2, ceilingFanHigh, ceilingFanOff);


        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);

        logger.info(remote.toString());
        remote.undoButtonWasPushed();

        remote.onButtonWasPushed(1);

        logger.info(remote.toString());
        remote.undoButtonWasPushed();

    }

}
