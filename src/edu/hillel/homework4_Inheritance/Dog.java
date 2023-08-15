package edu.hillel.homework4_Inheritance;

public class Dog extends Animal {

    private static final int DOG_RUN_RESTRICTION = 500;
    private static final int DOG_SWIM_RESTRICTION = 10;
    private static int dogCounter = 0;


    public Dog(String name, int runLength, int swimLength) {
        super(name, runLength, swimLength);
        dogCounter++;

    }

    @Override
    public void run() {
        super.run();
        if (getRunLength() > DOG_RUN_RESTRICTION) {
            System.out.println(getName() + " can only run up to " + DOG_RUN_RESTRICTION + " meters."
                    + "(" + getRunLength() + ")");
        } else {
            System.out.println(getName() + " ran " + getRunLength() + " meters.");
        }
    }

    @Override
    public void swim() {
        super.swim();
        if (getSwimLength() > DOG_SWIM_RESTRICTION) {
            System.out.println(getName() + " can only swim up to " + DOG_SWIM_RESTRICTION + " meters."
                    + "(" + getSwimLength() + ")");
        } else {
            System.out.println(getName() + " swam " + getSwimLength() + " meters.");
        }
    }


    public static void showDogCounter(){
        System.out.println("Dogs created: " + dogCounter);
    }
}
