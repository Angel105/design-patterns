package com.example.design_patterns;

import com.example.design_patterns.collections.DinnerMenu;
import com.example.design_patterns.collections.MenuItem;
import com.example.design_patterns.collections.PancakeHouseMenu;
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


        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();

        DinnerMenu dinnerMenu = new DinnerMenu();
        MenuItem[] lunchItems = dinnerMenu.getMenuItems();

        logger.info("\nMENU\n----\nBREAKFAST");
        for (int i = 0; i < breakfastItems.size(); i++) {
            MenuItem item = breakfastItems.get(i);
            logger.info("{} ${} {}", item.getName(), item.getPrice(), item.getDescription());
        }

        logger.info("\nLUNCH");
        for (int i = 0; i < lunchItems.length; i++) {
            MenuItem item = lunchItems[i];
            logger.info("{} ${} {}", item.getName(), item.getPrice(), item.getDescription());
        }

    }
}
