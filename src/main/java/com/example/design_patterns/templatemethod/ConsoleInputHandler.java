package com.example.design_patterns.templatemethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputHandler implements InputHandler {
    private static final Logger logger = LoggerFactory.getLogger(ConsoleInputHandler.class);
    @Override
    public String getUserInput(String prompt) {
        String answer = null;
        logger.info(prompt);

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            logger.error("IO error trying to read your answer");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
