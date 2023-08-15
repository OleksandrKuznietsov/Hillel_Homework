package edu.hillel.homework4_Inheritance;

public class Cat extends Animal{

    private static final int CAT_RUN_RESTRICTION = 200;
    private static int catCounter = 0;

    public Cat(String name, int runLength, int swimLength) {
        super(name, runLength, swimLength);
        catCounter++;
    }


    @Override
    public void run() {
        super.run();
        if (getRunLength() > CAT_RUN_RESTRICTION) {
            System.out.println(getName() + " can only run up to 200 meters." + "(" + getRunLength() + ")");
        }else {
            System.out.println(getName() + " ran " + getRunLength() + " meters.");
        }

    }

    @Override
    public void swim() {
        super.swim();
        System.out.println("Sadly, " + getName() +  " can't swim, because he's a cat");
    }


    public static void showCatCounter(){
        System.out.println("Cats created: " + catCounter);
    }

}
