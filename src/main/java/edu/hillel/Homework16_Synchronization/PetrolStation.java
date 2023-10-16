package edu.hillel.Homework16_Synchronization;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

public class PetrolStation {
    private final AtomicInteger amount = new AtomicInteger(0);
    private final Semaphore refuelSemaphore = new Semaphore(3);

    public void doRefuel(int fuelAmount) {
        try {
            refuelSemaphore.acquire();

            System.out.println("Starting to refuel: " + Thread.currentThread().getName());

            int refuelTime = new Random().nextInt(8) + 3;

            Thread.sleep(refuelTime * 1000);

            amount.getAndAdd(-fuelAmount);

            System.out.println("Refueling for " + Thread.currentThread().getName() + " is done. Amount of fuel left: "
                    + getAmount());
        } catch (InterruptedException e) {
            String message = e.getMessage();
            System.out.println(message);
        } finally {
            refuelSemaphore.release();
        }

    }

    public int getAmount() {
        return amount.get();
    }

    public void setAmount(int newAmount) {
        amount.set(newAmount);
    }
}
