package edu.hillel.homework5_Polymorphism.Participants;

public abstract class Obstacle {
    private String name;
    private int length;
    private int height;

    public Obstacle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public abstract void overcome(Participant participant);

}
