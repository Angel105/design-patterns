package com.example.design_patterns;

import com.example.design_patterns.decorator.*;
import com.example.design_patterns.decorator.impl.Milk;
import com.example.design_patterns.decorator.impl.Mocha;
import com.example.design_patterns.decorator.impl.Soy;
import com.example.design_patterns.decorator.impl.Whip;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static com.example.design_patterns.decorator.Beverage.Size.GRANDE;
import static com.example.design_patterns.decorator.Beverage.Size.VENTI;

@SpringBootApplication
public class DesignPatternsApplication {

	private static  final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		Beverage beverage = new Espresso();
        logger.info("{}, ${}", beverage.getDescription(), formatPrice(beverage.cost()));

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		logger.info("{}, ${}", beverage2.getDescription(), formatPrice(beverage2.cost()));

		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		logger.info("{}, ${}", beverage3.getDescription(), formatPrice(beverage3.cost()));

		Beverage beverage4 = new Decaf();
		beverage4.setSize(GRANDE);
		beverage4 = new Milk(beverage4);
		logger.info("{}, ${}", beverage4.getDescription(), formatPrice(beverage4.cost()));
	}

	private static String formatPrice(double cost) {
		return String.format("%.2f", cost);
	}

}
