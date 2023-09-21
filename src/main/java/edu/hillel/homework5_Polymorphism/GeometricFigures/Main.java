package edu.hillel.homework5_Polymorphism.GeometricFigures;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();
        int[] figuresArray = new int[]{circle.getArea(), square.getArea(), triangle.getArea()};
        for (int j : figuresArray) {
            sum += j;
        }
        System.out.println("Total area of figures = " + sum);
    }
}

