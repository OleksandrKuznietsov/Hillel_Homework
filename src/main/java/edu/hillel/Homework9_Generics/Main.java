package edu.hillel.Homework9_Generics;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Apple());
        apples.add(new Apple());

        ArrayList<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());

        Box<Apple> appleBox = new Box<>("appleBox");
        appleBox.addFruit(new Apple());
        appleBox.addFruit(new Apple());
        appleBox.addMultipleFruits(apples);

        Box<Orange> orangeBox = new Box<>("orangeBox");
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addFruit(new Orange());
        orangeBox.addMultipleFruits(oranges);


        Box<Apple> appleBox1 = new Box<>("appleBox1");
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addMultipleFruits(apples);

        Box<Orange> orangeBox1 = new Box<>("orangeBox2");
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        orangeBox1.addMultipleFruits(oranges);

        System.out.println(appleBox.compare(appleBox1));
        System.out.println();
        appleBox.merge(appleBox1);


        appleBox1.getTotalWeight();

        System.out.println(appleBox.compare(orangeBox));

    }
}
