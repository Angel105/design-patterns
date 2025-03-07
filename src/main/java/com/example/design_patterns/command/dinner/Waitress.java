package com.example.design_patterns.command.dinner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Waitress {

    private final static Logger logger = LoggerFactory.getLogger(Waitress.class);
    private List<Order> orders;

    public Waitress() {
        this.orders = new ArrayList<>();
    }

    public void takeOrder(Order order) {
        logger.info("I'm taking a new order: {}", order);
        this.orders.add(order);
        order.orderUp();
    }
}
