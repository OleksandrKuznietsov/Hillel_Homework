package edu.hillel.homework5_Polymorphism.Participants;

public abstract class Obstacle {
    private String name;
    private int length;
    private int height;

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public abstract void overcome(Participant participant);

}
