package edu.hillel.Homework20_Patterns.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        Furniture table = factory.createFurniture("table");
        table.create();

        Furniture chair = factory.createFurniture("chair");
        chair.create();
    }
}
