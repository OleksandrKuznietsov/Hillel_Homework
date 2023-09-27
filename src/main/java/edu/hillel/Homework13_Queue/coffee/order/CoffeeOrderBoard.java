package edu.hillel.Homework13_Queue.coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private final List<Order> orderList = new ArrayList<>();
    private int nextOrderNumber = 1;


    public void add(String name) {
        Order order = new Order(nextOrderNumber, name);
        orderList.add(order);
        nextOrderNumber++;
    }


    public void deliverClosest() {
        System.out.println("----------------------------------");
        if (!orderList.isEmpty()) {
            Order orderToDeliver = orderList.get(0);
            orderList.remove(0);
            System.out.println("Delivering order №" + orderToDeliver.getOrderNumber());
        } else {
            System.out.println("No orders to deliver");
        }
    }

    public void deliver(int orderNumber) {
        System.out.println("----------------------------------");
        for (Order order : orderList) {
            if (order.getOrderNumber() == orderNumber) {
                orderList.remove(order);
                System.out.println("Delivering order №" + orderNumber);
                return;
            }
        }
        System.out.println("Order №" + orderNumber + " not found.");
    }

    public void draw() {
        System.out.println("----------------------------------");
        System.out.println("Current Order list:");
        for (Order order : orderList) {
            System.out.println(order.getOrderNumber() + " | " + order.getClientName());
        }
    }

}
