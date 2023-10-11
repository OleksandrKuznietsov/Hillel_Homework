package edu.hillel.Homework16_Synchronization;

public class Main {
    public static void main(String[] args) {
        ThreadSafeList<Integer> list = new ThreadSafeList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list.get(0));

        list.remove(3);

        System.out.println(list);

        System.out.println();


        PetrolStation petrolStation = new PetrolStation();
        petrolStation.setAmount(200);

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> petrolStation.doRefuel(20));
            thread.start();
        }

    }
}
