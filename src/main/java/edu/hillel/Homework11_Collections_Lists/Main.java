package edu.hillel.Homework11_Collections_Lists;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("orange");
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("watermelon");
        list.add("orange");
        list.add("lemon");
        list.add("pineapple");
        list.add("pineapple");
        list.add("strawberry");
        list.add("orange");
        list.add("grape");
        list.add("kiwi");
        list.add("kiwi");


        Integer[] intArray = {1, 2, 3, 4, 5};

        String[] stringArray = new String[]{"Apple", "Banana", "Orange", "Lemon", "Berries"};

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(3);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(5);

        System.out.println(countOccurrence(list, "orange"));
        System.out.println(toList(intArray));
        System.out.println(toList(stringArray));
        System.out.println(findUnique(integerList));
        calcOccurrence(list);
        findOccurrence(list);
    }


    public static int countOccurrence(List<String> list, String word) {
        System.out.print("Task 1 Number of coincidences: ");
        int count = 0;
        for (String s : list) {
            if (word.equals(s)) {
                count++;
            }
        }
        return count;
    }


    public static <T> List<T> toList(T[] newArray) {
        System.out.println("Task 2 ---------------------------");
        return Arrays.asList(newArray);
    }

    public static List<Integer> findUnique(List<Integer> inputList) {
        System.out.println("Task 3 ---------------------------");
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer number : inputList) {
            if (!uniqueList.contains(number)) {
                uniqueList.add(number);
            }
        }
        return uniqueList;
    }

    public static void calcOccurrence(List<String> list) {
        System.out.println("Task 4 ---------------------------");
        List<String> uniqueList = new ArrayList<>();
        List<Integer> wordCounter = new ArrayList<>();
        for (String word : list) {
            if (!uniqueList.contains(word)) {
                uniqueList.add(word);
                wordCounter.add(1);
            } else {
                wordCounter.set(uniqueList.indexOf(word), wordCounter.get(uniqueList.indexOf(word)) + 1);
            }
        }
        for (int i = 0; i < uniqueList.size(); i++) {
            System.out.println(uniqueList.get(i) + " " + wordCounter.get(i));
        }
    }


    public static void findOccurrence(List<String> list) {
        System.out.println("Task 5 ---------------------------");
        List<String> uniqueList = new ArrayList<>();
        List<Integer> wordCounter = new ArrayList<>();
        List<String> occurrenceList = new ArrayList<>();
        for (String word : list) {
            if (!uniqueList.contains(word)) {
                uniqueList.add(word);
                wordCounter.add(1);
            } else {
                wordCounter.set(uniqueList.indexOf(word), wordCounter.get(uniqueList.indexOf(word)) + 1);
            }
        }
        for (int i = 0; i < uniqueList.size(); i++) {
            occurrenceList.add("\n{name: \"" + uniqueList.get(i) + "\",occurrence:" + wordCounter.get(i) + "}");
        }
        System.out.println(occurrenceList);


    }
}




