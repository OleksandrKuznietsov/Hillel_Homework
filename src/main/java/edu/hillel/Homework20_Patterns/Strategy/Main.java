package edu.hillel.Homework20_Patterns.Strategy;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 4);
        Triangle triangle = new Triangle(5, 6);

        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
    }
}
