package edu.hillel.homework5_Polymorphism.Participants;

public abstract class Participant {
    private String name;
    private int runRestriction;
    private int jumpRestriction;

    public Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRunRestriction() {
        return runRestriction;
    }

    public int getJumpRestriction() {
        return jumpRestriction;
    }

    public void setRunRestriction(int runRestriction) {
        this.runRestriction = runRestriction;
    }

    public void setJumpRestriction(int jumpRestriction) {
        this.jumpRestriction = jumpRestriction;
    }

    public abstract void run(Obstacle obstacle);

    public abstract void jump(Obstacle obstacle);
}
