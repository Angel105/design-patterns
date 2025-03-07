package com.example.design_patterns;

import com.example.design_patterns.command.Command;
import com.example.design_patterns.command.RemoteControl;
import com.example.design_patterns.command.impl.*;
import com.example.design_patterns.command.receiver.Hottub;
import com.example.design_patterns.command.receiver.Light;
import com.example.design_patterns.command.receiver.Stereo;
import com.example.design_patterns.command.receiver.TV;
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

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
        Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remote.setCommand(0, partyOnMacro, partyOffMacro);

        logger.info(remote.toString());
        logger.info("--- Pushing Macro On ---");
        remote.onButtonWasPushed(0);
        logger.info("--- Pushing Macro Off ---");
        remote.offButtonWasPushed(0);

    }

}
