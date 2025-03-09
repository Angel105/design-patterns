package com.example.design_patterns.facade.hometheater.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamingPlayer {
    private final static Logger logger = LoggerFactory.getLogger(StreamingPlayer.class);

    private final String description;
    private final Amplifier amplifier;

    private int currentChapter;
    private String movie;

    public StreamingPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }

    public void on() {
        logger.info("{} on", description);
    }
    public void off() {
        logger.info("{} off", description);
    }
    public void play(String movie) {
        this.movie = movie;
        currentChapter = 0;
        logger.info("{} playing '{}'", description, movie);
    }

    public void play(int chapter) {
        if (movie == null) {
            logger.warn("{} can't play chapter {} no movie selected", description, chapter);
        } else {
            currentChapter = chapter;
            logger.info("{} playing chapter {} of '{}'", description, currentChapter, movie);
        }
    }

    public void stop() {
        currentChapter = 0;
        logger.info("{} stopped \"{}\"", description, movie);
    }

    public void pause() {
        currentChapter = 0;
        logger.info("{} paused \"{}\"", description, movie);
    }

    public void setTwoChannelAudio() {
        logger.info("{} set two channel audio", description);
    }

    public void setSurroundAudio() {
        logger.info("{} set surround audio", description);
    }

    @Override
    public String toString() {
        return description;
    }
}
