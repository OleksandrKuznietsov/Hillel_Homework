package edu.hillel.homework5_Polymorphism.Participants;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();


        Human humanDave = new Human("Dave");
        Cat catFelix = new Cat("Felix");
        Robot robotR2D2 = new Robot("R2-D2");


        Treadmill treadmill = new Treadmill(100);
        Wall wall = new Wall(10);


        Obstacle[] obstacles = new Obstacle[]{treadmill, wall};


        Participant[] participants = new Participant[]{humanDave, catFelix, robotR2D2};
        for (int j = 0; j < obstacles.length - 1; j++) {
            for (int i = 0; i < participants.length; i++) {
                participants[i].setRunRestriction(random.nextInt(200));
                participants[i].setJumpRestriction(random.nextInt(20));
                if (participants[i].getRunRestriction() < obstacles[j].getLength()) {
                    participants[i].run(treadmill);
                } else {
                    participants[i].run(obstacles[j]);
                    participants[i].jump(obstacles[j]);
                }
            }
        }

    }
}





