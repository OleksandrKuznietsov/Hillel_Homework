package edu.hillel.Homework20_Patterns.Strategy;

public class Rectangle implements ShapeAreaCalculator{
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        System.out.print("The area of the rectangle is: ");
        return width*height;
    }
}
