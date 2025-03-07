package com.example.design_patterns.command.dinner.client;

import com.example.design_patterns.command.dinner.Waitress;
import com.example.design_patterns.command.dinner.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Customer {

    private static final Logger logger = LoggerFactory.getLogger(Customer.class);

    private Waitress waitress;

    private Order order;

    public void callWaitress(Waitress waitress) {
        this.waitress = waitress;
    }

    public void placeOrder(Order order) {
        if (waitress == null) {
            logger.warn("Where is a waitress? I'm ready to place an order.");
            return;
        }
        this.order = order;
        waitress.takeOrder(order);
    }
}
