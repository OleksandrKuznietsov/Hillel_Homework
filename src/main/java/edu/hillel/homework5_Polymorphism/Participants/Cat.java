package edu.hillel.homework5_Polymorphism.Participants;

public class Cat extends Participant {


    public Cat(String name) {
        super(name);
    }

    @Override
    public void run(Obstacle obstacle) {
        if (getRunRestriction() >= obstacle.getLength()) {
            System.out.println("Participant " + getName() + " passed an obstacle " + obstacle.getName()
                    + " on a distance " + obstacle.getLength());
        } else {
            System.out.println("Participant " + getName() + " couldn't pass an obstacle " + obstacle.getName()
                    + " on a distance " + obstacle.getLength() + ". Distance passed: " + getRunRestriction());
        }

    }

    @Override
    public void jump(Obstacle obstacle) {
        if (getJumpRestriction() >= obstacle.getHeight()) {
            System.out.println("Participant " + getName() + " jumped over " + obstacle.getHeight() + " meter "
                    + obstacle.getName());
        } else {
            System.out.println("Participant " + getName() + " wasn't able to jump over "
                    + obstacle.getHeight() + " meter " + obstacle.getName() + ". He jumped for : "
                    + getJumpRestriction());

        }

    }
}
