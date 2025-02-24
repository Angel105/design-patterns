package com.example.design_patterns;

import com.example.design_patterns.strategy.Duck;
import com.example.design_patterns.strategy.MallardDuck;
import com.example.design_patterns.strategy.RedheadDuck;
import com.example.design_patterns.strategy.RubberDuck;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		Duck duckMallard = new MallardDuck();
		Duck duckRedhead = new RedheadDuck();
		Duck rubberDuck = new RubberDuck();

		duckMallard.display();
		duckMallard.fly();

		duckRedhead.display();
		duckRedhead.fly();

		rubberDuck.display();
		rubberDuck.quack();
		rubberDuck.fly();
	}

}
