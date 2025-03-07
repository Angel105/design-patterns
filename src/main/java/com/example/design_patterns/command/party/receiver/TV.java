package com.example.design_patterns.command.party.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TV {

	private final static Logger logger = LoggerFactory.getLogger(TV.class);

	private final String location;
	private int channel;

	public TV(String location, int channel) {
		this(location);
        this.channel = channel;
    }

	public TV(String location) {
		this.location = location;
	}

	public void on() {
        logger.info("{} TV is on", location);
	}

	public void off() {
        logger.info("{} TV is off", location);
	}

	public void setInputChannel(int channel) {
		this.channel = channel;
	}
	public void setInputChannel() {
		this.channel = 3;
        logger.info("{} TV channel is set for DVD", location);
	}
}
