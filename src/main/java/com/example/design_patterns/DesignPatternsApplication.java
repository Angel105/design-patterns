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
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorUp = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorDown = new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, kitchenLightOn, kitchenLightOff);
        remote.setCommand(2, ceilingFanOn, ceilingFanOff);
        remote.setCommand(3, stereoOnWithCD, stereoOff);
        remote.setCommand(4, garageDoorUp, garageDoorDown);

        logger.info(remote.toString());

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);

        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);

        remote.onButtonWasPushed(2);
        remote.offButtonWasPushed(2);

        remote.onButtonWasPushed(3);
        remote.offButtonWasPushed(3);

        remote.onButtonWasPushed(4);
        remote.offButtonWasPushed(4);
    }

}
