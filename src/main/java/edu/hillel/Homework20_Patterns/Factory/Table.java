package edu.hillel.Homework20_Patterns.Factory;

public class Table implements Furniture {
    @Override
    public void create() {
        System.out.println("Table was made.");
    }
}
