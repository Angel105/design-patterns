package com.example.design_patterns;

import com.example.design_patterns.adapter.Duck;
import com.example.design_patterns.adapter.Turkey;
import com.example.design_patterns.adapter.TurkeyAdapter;
import com.example.design_patterns.adapter.impl.MallardDuck;
import com.example.design_patterns.adapter.impl.WildTurkey;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        logger.info("The Turkey says :");
        turkey.gobble();
        turkey.fly();

        logger.info("The Duck says :");
        testDuck(duck);

        logger.info("The TurkeyAdapter says :");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
