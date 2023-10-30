package edu.hillel.Homework20_Patterns.Factory;

public class Factory {
    public Furniture createFurniture(String type) {
        if ("table".equalsIgnoreCase(type)) {
            return new Table();
        } else if ("chair".equalsIgnoreCase(type)) {
            return new Chair();
        } else {
            throw new IllegalArgumentException("Unknown furniture type.");
        }
    }
}
