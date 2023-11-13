package edu.hillel.Homework20_Patterns.Factory;

public class ChairFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Chair();
    }
}
