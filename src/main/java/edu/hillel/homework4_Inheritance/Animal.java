package edu.hillel.homework4_Inheritance;

public class Animal {
    private static int animalCounter = 0;
    private String name;
    private int runLength;
    private int swimLength;


    public Animal(String name, int runLength, int swimLength) {
        this.name = name;
        this.runLength = runLength;
        this.swimLength = swimLength;
        animalCounter++;
    }

    public String getName() {
        return name;
    }


    public int getRunLength() {
        return runLength;
    }


    public int getSwimLength() {
        return swimLength;
    }


    public void run() {

    }


    public void swim() {

    }

    public static void showAnimalCounter() {
        System.out.println("Animals created: " + animalCounter);
    }
}
