package edu.hillel.homework5_Polymorphism.Participants;

public class Wall extends Obstacle {


    public Wall(String name) {
        super(name);
    }

    @Override
    public void overcome(Participant participant) {
        if (participant.getJumpRestriction() >= getHeight()) {
            System.out.println("Participant " + participant.getName() + " jumped over " + getHeight() + " meter "
                    + getName());
        } else {
            System.out.println("Participant " + participant.getName() + " wasn't able to jump over "
                    + getHeight() + " meter " + getName() + ". He jumped for : " + participant.getJumpRestriction());

        }
    }
}



