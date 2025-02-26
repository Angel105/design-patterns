package com.example.design_patterns;

import com.example.design_patterns.decorator.Beverage;
import com.example.design_patterns.decorator.DarkRoast;
import com.example.design_patterns.decorator.Espresso;
import com.example.design_patterns.decorator.HouseBlend;
import com.example.design_patterns.decorator.impl.Mocha;
import com.example.design_patterns.decorator.impl.Soy;
import com.example.design_patterns.decorator.impl.Whip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.design_patterns.decorator.Beverage.Size.VENTI;

@SpringBootApplication
public class DesignPatternsApplication {

	private static  final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		Beverage beverage = new Espresso();
        logger.info("{}, ${}", beverage.getDescription(), beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		logger.info("{}, ${}", beverage2.getDescription(), beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		logger.info("{}, ${}", beverage3.getDescription(), beverage3.cost());

	}

}
