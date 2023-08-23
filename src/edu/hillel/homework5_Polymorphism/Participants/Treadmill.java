package edu.hillel.homework5_Polymorphism.Participants;

public class Treadmill extends Obstacle {
    private int length;

    public Treadmill(String name) {
        super(name);
    }


    @Override
    public void overcome(Participant participant) {
        if (participant.getRunRestriction() < getLength()) {
            System.out.println("Participant " + participant.getName() + " couldn't pass an obstacle " + getName()
                    + " on a distance " + getLength() + ". Distance passed: " + participant.getRunRestriction());
        } else if (participant.getRunRestriction() >= getLength()) {
            System.out.println("Participant " + participant.getName() + " passed an obstacle " + getName()
                    + " on a distance " + getLength());
        } else if (participant.getJumpRestriction() < getHeight()) {
            System.out.println();
        }
    }
}
