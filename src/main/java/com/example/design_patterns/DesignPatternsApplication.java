package com.example.design_patterns;

import com.example.design_patterns.command.dinner.Order;
import com.example.design_patterns.command.dinner.Waitress;
import com.example.design_patterns.command.dinner.client.Customer;
import com.example.design_patterns.command.dinner.receiver.Cook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

    private static final Logger logger = LoggerFactory.getLogger(DesignPatternsApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        Cook cook = new Cook();
        Waitress waitress = new Waitress();
        Customer customer = new Customer();

        customer.callWaitress(waitress);
        Order o = () -> { cook.makeBurger(); cook.makeFries(); };
        customer.placeOrder(o );

    }

}
