package edu.hillel.Homework20_Patterns.Strategy;

public class Triangle implements ShapeAreaCalculator {
    private final double side;
    private final double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        System.out.print("The area of the triangle is: ");
        return 0.5 * (side * height);
    }
}
