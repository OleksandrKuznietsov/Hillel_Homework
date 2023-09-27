package edu.hillel.Homework13_Queue.coffee.order;

public class Order {
    private final int orderNumber;
    private final String clientName;

    public Order(int orderNumber, String clientName) {
        this.orderNumber = orderNumber;
        this.clientName = clientName;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getClientName() {
        return clientName;
    }


}
