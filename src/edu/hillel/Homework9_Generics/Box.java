package edu.hillel.Homework9_Generics;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private String name;
    ArrayList<T> box = new ArrayList<>();

    public Box(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public void addMultipleFruits(ArrayList<T> fruits) {
        box.addAll(fruits);

    }

    public float getTotalWeight() {
        float totalWeight = 0F;
        for (T t : box) {
            totalWeight += t.getWeight();
        }
        System.out.println("Total weight of the " + getName() + " = " + totalWeight);
        System.out.println();
        return totalWeight;
    }


    public boolean compare(Box<?> box) {
        System.out.println("Comparing " + getName() + " to " + box.getName());
        System.out.println();
        return getTotalWeight() == box.getTotalWeight();
    }

    public void merge(Box<T> newBox) {
        box.addAll(newBox.box);
        newBox.box.clear();
        System.out.println("Fruits have been merged from " + newBox.getName() + " to " + getName() + ".");
        System.out.println();
    }

}
