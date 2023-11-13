package edu.hillel.Homework20_Patterns.Builder;

public class CarBuilder {
    private String engine;
    private String wheels;
    private String bodyType;


    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setBodyType(String bodyType) {
        this.bodyType = bodyType;
        return this;
    }

    public Car build() {
        return new Car(engine, wheels, bodyType);
    }
}
