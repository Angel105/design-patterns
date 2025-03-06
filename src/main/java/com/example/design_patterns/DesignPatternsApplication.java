package com.example.design_patterns;

import com.example.design_patterns.command.Command;
import com.example.design_patterns.command.RemoteControl;
import com.example.design_patterns.command.receiver.CeilingFan;
import com.example.design_patterns.command.receiver.GarageDoor;
import com.example.design_patterns.command.receiver.Light;
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

        remote.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
        remote.setCommand(1, kitchenLight::on, kitchenLight::off);
        remote.setCommand(2, ceilingFan::high, ceilingFan::off);
        Command stereoOnWithCD = () -> {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        };
        remote.setCommand(3, stereoOnWithCD, stereo::off);
        remote.setCommand(4, garageDoor::up, garageDoor::down);

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

        remote.onButtonWasPushed(5);
        remote.offButtonWasPushed(5);
    }

}
