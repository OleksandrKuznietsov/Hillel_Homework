package edu.hillel.Homework15_Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ValueCalculator valueCalculator = new ValueCalculator(1000000);

        valueCalculator.calculateValues();
    }
}
