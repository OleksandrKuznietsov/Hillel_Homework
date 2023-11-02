package edu.hillel.Homework20_Patterns.Factory;

public class TableFactory implements FurnitureFactory{
    @Override
    public Furniture createFurniture() {
        return new Table();
    }
}
