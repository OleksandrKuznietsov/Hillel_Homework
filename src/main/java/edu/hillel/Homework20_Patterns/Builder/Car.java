package edu.hillel.Homework20_Patterns.Builder;

public class Car {
    private final String engine;
    private final String wheels;
    private final String bodyType;

    public Car(String engine, String wheels, String bodyType) {
        this.engine = engine;
        this.wheels = wheels;
        this.bodyType = bodyType;
    }

    public void showCarInfo() {
        System.out.println("Engine: " + engine);
        System.out.println("Wheels: " + wheels);
        System.out.println("Body type: " + bodyType);
    }
}
