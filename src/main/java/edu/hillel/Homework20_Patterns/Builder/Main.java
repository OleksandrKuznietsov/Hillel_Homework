package edu.hillel.Homework20_Patterns.Builder;

public class Main {
    public static void main(String[] args) {
        Car car = new CarBuilder()
                .setEngine("V8")
                .setWheels("20inch")
                .setBodyType("Sedan")
                .build();

        car.showCarInfo();
    }
}
