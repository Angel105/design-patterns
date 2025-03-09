package com.example.design_patterns;

import com.example.design_patterns.adapter.enumiter.IteratorEnumeration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;

@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        List<String> l = new ArrayList<>(Arrays.asList(new String[]{"This is", "an", "example", "of", "Adapter", "Pattern"}));
        Enumeration<?> enumeration = new IteratorEnumeration(l.iterator());

        while (enumeration.hasMoreElements()) {
            logger.info(enumeration.nextElement().toString());
        }
    }
}
