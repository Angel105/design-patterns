package com.example.design_patterns.facade.hometheater.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Amplifier {
    private final static Logger logger = LoggerFactory.getLogger(Amplifier.class);

    private final String description;
    private Tuner tuner;
    private StreamingPlayer streamingPlayer;

    public Amplifier(String description) {
        this.description = description;
    }

    public void on() {
        logger.info("{} on", description);
    }

    public void off() {
        logger.info("{} off", description);
    }

    public void setStereoSound() {
        logger.info("{} setting stereo mode on", description);
    }

    public void setSurroundSound() {
        logger.info("{} surround sound on (5 speakers, 1 subwoofer)", description);
    }

    public void setVolume(int level) {
        logger.info("{} setting volume to {}", description, level);
    }

    public void setTuner(Tuner tuner) {
        logger.info("{} setting tuner to {}", description, tuner);
        this.tuner = tuner;
    }

    public void setStreamingPlayer(StreamingPlayer streamingPlayer) {
        logger.info("{} setting Streaming player to {}", description, streamingPlayer);
        this.streamingPlayer = streamingPlayer;
    }

    @Override
    public String toString() {
        return description;
    }

}
