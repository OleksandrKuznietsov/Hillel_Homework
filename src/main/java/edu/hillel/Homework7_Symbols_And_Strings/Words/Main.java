package edu.hillel.Homework7_Symbols_And_Strings.Words;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tempWordLength;
        String inputWord;
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        System.out.println("Computer made a word. Try to guess it.");
        String hiddenWord = words[random.nextInt(25)];

        //Word made by the computer
        //System.out.println(hiddenWord);

        do {
            inputWord = scanner.nextLine();

            if (inputWord.equals(hiddenWord)) {
                System.out.println("You've guessed the word. Congratulations!" + "(" + hiddenWord + ")");
            }else {
                if (inputWord.length() < hiddenWord.length()) {
                    tempWordLength = inputWord.length();
                } else {
                    tempWordLength = hiddenWord.length();
                }

                for (int i = 0; i < tempWordLength; i++) {
                    if (hiddenWord.charAt(i) == inputWord.charAt(i)) {
                        System.out.print(inputWord.charAt(i));
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.print("##########");
                System.out.println();
            }

        }while (!hiddenWord.equals(inputWord));

    }
}
