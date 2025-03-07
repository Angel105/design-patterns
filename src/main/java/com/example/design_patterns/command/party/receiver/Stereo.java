package com.example.design_patterns.command.party.receiver;

import org.slf4j.Logger;

public class Stereo {

    private static final Logger logger = org.slf4j.LoggerFactory.getLogger(Stereo.class);

    private final String location;

    public Stereo(String location) {
        this.location = location;
    }


    public void on() {
        logger.info("{} Stereo is on", location);
    }

    public void setCD() {
        logger.info("{} Stereo is set for CD input", location);
    }

    public void setVolume(int volume) {
        logger.info("{} Stereo volume set to {}", location, volume);
    }

    public void off() {
        logger.info("{} Stereo is off", location);
    }
}
