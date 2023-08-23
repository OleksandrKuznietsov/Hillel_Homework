package edu.hillel.homework6_Data_Types;


import java.util.Random;

public class HomeWorkApp {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(20) - 10;

        int b = random.nextInt(20) - 10;

        printThreeWords();

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println(checkSum(a, b));

        checkNumberSign(a);

        System.out.println(checkNumber(a));

        printLine("Hello World", 7);

        System.out.println(checkYear(2023));
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
        System.out.println();
    }

    static void checkSumSign() {
        Random random = new Random();
        int a = random.nextInt(20) - 10;
        int b = random.nextInt(20) - 10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("The sum is positive" + " (" + sum + ")");
        } else {
            System.out.println("The sum is negative" + " (" + sum + ")");
        }
        System.out.println();

    }

    static void printColor() {
        Random random = new Random();
        int value = random.nextInt(300) - 100;
        if (value <= 0) {
            System.out.println("Red" + " (" + value + ")");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow" + " (" + value + ")");
        } else {
            System.out.println("Green" + " (" + value + ")");
        }
        System.out.println();

    }

    static void compareNumbers() {
        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        System.out.println("a = " + a + " / " + "b = " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
        System.out.println();
    }

    static boolean checkSum(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }

    }

    static void checkNumberSign(int a) {
        System.out.println();
        if (a >= 0) {
            System.out.println("The number is positive" + " (" + a + ")");
        } else {
            System.out.println("The number is negative" + " (" + a + ")");
        }
    }

    static boolean checkNumber(int a) {
        System.out.println();
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    static void printLine(String line, int x) {
        System.out.println();
        for (int i = 0; i < x; i++) {
            System.out.println(line);
        }
    }

    static boolean checkYear(int year) {
        System.out.println();
        if ((year % 4 != 0 || year % 100 == 0) && (year % 400 != 0)) {
            return false;
        } else {
            return true;
        }
    }
}