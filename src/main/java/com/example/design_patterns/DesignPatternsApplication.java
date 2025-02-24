package com.example.design_patterns;

import com.example.design_patterns.strategy.*;
import com.example.design_patterns.strategy.impl.FlyRocketPowered;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		Duck mallard = new MallardDuck();
		Duck redHead = new RedheadDuck();

		FlyBehavior cantFly = () -> logger.info("I can't fly");
		QuackBehavior squeak = () -> logger.info("Squeak");
		Duck rubberDuck = new RubberDuck(cantFly, squeak);

		mallard.display();
		mallard.performQuack();
		mallard.performFly();

		redHead.display();
		redHead.performQuack();
		redHead.performFly();

		rubberDuck.display();
		rubberDuck.performQuack();
		rubberDuck.performFly();

		Duck model = new ModelDuck();
		model.display();
		model.performQuack();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

		Duck decoy = new DecoyDuck();
		decoy.display();
		decoy.performQuack();
		decoy.performFly();
	}

}
