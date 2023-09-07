package edu.hillel.homework4_Inheritance;

public class Main {
    public static void main(String[] args) {
        Cat catLev = new Cat("Lev", 100, 0);
        Cat catMurchik = new Cat("Murchik", 250, 10);


        Dog dogBobik = new Dog("Bobik", 400, 5);
        Dog dogSharik = new Dog("Sharik", 600, 8);
        Dog dogJack = new Dog("Jack", 300, 15);


        catLev.run();

        catMurchik.run();
        catMurchik.swim();


        dogBobik.run();


        dogSharik.run();
        dogSharik.swim();


        dogJack.swim();


        System.out.println();
        Cat.showCatCounter();
        Dog.showDogCounter();
        Animal.showAnimalCounter();
    }
}
