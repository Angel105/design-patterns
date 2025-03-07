package com.example.design_patterns;

import com.example.design_patterns.adapter.enumiter.EnumerationIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        Vector<String> v = new Vector<>(Arrays.asList(new String[]{"This is", "an", "example", "of", "Adapter", "Pattern"}));
        Iterator<?> iterator = new EnumerationIterator(v.elements());

        while (iterator.hasNext()) {
            logger.info(iterator.next().toString());
        }
    }
}
