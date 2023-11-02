package edu.hillel.Homework20_Patterns.Factory;

public class Main {
    public static void main(String[] args) {
     FurnitureFactory chairFactory = new ChairFactory();
     Furniture chair = chairFactory.createFurniture();
     chair.create();

     FurnitureFactory tableFactory = new TableFactory();
     Furniture table = tableFactory.createFurniture();
     table.create();
    }
}
