package edu.hillel.Homework13_Queue;

import edu.hillel.Homework13_Queue.coffee.order.CoffeeOrderBoard;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        coffeeOrderBoard.add("Alex");
        coffeeOrderBoard.add("Bob");
        coffeeOrderBoard.add("John");
        coffeeOrderBoard.add("Dave");
        coffeeOrderBoard.add("Mark");
        coffeeOrderBoard.add("Bill");
        coffeeOrderBoard.add("David");
        coffeeOrderBoard.add("Alen");

        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliverClosest();

        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliver(5);

        coffeeOrderBoard.draw();

        coffeeOrderBoard.deliverClosest();

        coffeeOrderBoard.draw();

    }
}
