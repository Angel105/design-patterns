package com.example.design_patterns;

import com.example.design_patterns.templatemethod.list.MyStringList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        String[] ducks = {"Mallard Duck", "Redhead Duck", "Rubber Duck", "Decoy Duck"};
        MyStringList ducksList = new MyStringList(ducks);
        for (int i = 0; i < ducksList.size(); i++) {
            logger.info(ducksList.get(i));
        }

        String oldDuck = ducksList.set(3, "Donald Duck");
        logger.info("Replacing {} with {}", oldDuck, ducksList.get(3));
        logger.info("List after replacement: ");
        for (int i = 0; i < ducksList.size(); i++) {
            logger.info(ducksList.get(i));
        }

        List ducksSubList = ducksList.subList(2, 3);
        logger.info("Created a sub list of ducks of size: {}", ducksSubList.size());
        for (int i = 0; i < ducksSubList.size(); i++) {
            logger.info(ducksSubList.get(i).toString());
        }

    }
}
