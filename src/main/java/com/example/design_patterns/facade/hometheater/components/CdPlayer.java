package com.example.design_patterns.facade.hometheater.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CdPlayer {
    private final static Logger logger = LoggerFactory.getLogger(CdPlayer.class);

    private final String description;
    private final Amplifier amplifier;
    private int currentTrack;
    private String title;

    public CdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        logger.info("{} on", description);
    }
    public void off() {
        logger.info("{} off", description);
    }

    public void eject() {
        title = null;
        logger.info("{} eject", description);
    }

    public void play(String title) {
        this.title = title;
        currentTrack = 0;
        logger.info("{} playing '{}'", description, title);
    }

    public void play(int track) {
        if (title == null) {
            logger.warn("{} can't play track {}, no CD inserted", description, track);
        } else  {
            currentTrack = track;
            logger.info("{} playing track {}", description, currentTrack);
        }
    }

    public void stop() {
        currentTrack = 0;
        logger.info("{} stopped", description);
    }
    public void pause() {
        logger.info("{} paused \"{}\" ", description, title);
    }


    @Override
    public String toString() {
        return description;
    }

}
