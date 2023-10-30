package edu.hillel.Homework20_Patterns.Factory;

public class Chair implements Furniture {
    @Override
    public void create() {
        System.out.println("Chair was made.");
    }
}
