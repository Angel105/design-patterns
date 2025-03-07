package com.example.design_patterns.command.party.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hottub {

	private static final Logger logger = LoggerFactory.getLogger(Hottub.class);

	private boolean on;
	private int temperature;

	public Hottub() {
	}

	public void on() {
		on = true;
	}

	public void off() {
		on = false;
	}

	public void circulate() {
		if (on) {
			logger.info("Hottub is bubbling!");
		}
	}

	public void jetsOn() {
		if (on) {
			logger.info("Hottub jets are on");
		}
	}

	public void jetsOff() {
		if (on) {
			logger.info("Hottub jets are off");
		}
	}

	public void setTemperature(int temperature) {
		if (temperature > this.temperature) {
            logger.info("Hottub is heating to a steaming {} degrees", temperature);
		}
		else {
            logger.info("Hottub is cooling to {} degrees", temperature);
		}
		this.temperature = temperature;
	}
}
