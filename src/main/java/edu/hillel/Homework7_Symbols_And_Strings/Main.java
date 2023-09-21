package edu.hillel.Homework7_Symbols_And_Strings;
public class Main {
    public static void main(String[] args) {
        findSymbolOccurrence('l', "Hello world");
        findWordPosition("Hello", "lo");
        stringReverse("Hello world");
        System.out.println(isPalindrome("ERE"));
    }

    static int findSymbolOccurrence(char symbol, String line) {
        System.out.println("Task 1");
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == symbol) {
                count++;
            }
        }
        System.out.println("Number of coincidences: " + count);
        System.out.println();
        return count;
    }


    static int findWordPosition(String source, String target) {
        System.out.println("Task 2");
        int count = source.indexOf(target);
        System.out.println("Source: " + source);
        System.out.println("Target: " + target);
        System.out.println("Result: " + count);
        System.out.println();
        return count;
    }


    static void stringReverse(String str) {
        System.out.println("Task 3");
        System.out.println(new StringBuilder(str).reverse());

        //if StringBuilder is not allowed

//        char [] revArray = str.toCharArray();
//        for (int i = str.length() -1; i >= 0; i--) {
//            System.out.print(revArray[i]);
//        }
        System.out.println();
    }


    static boolean isPalindrome(String palindrome) {
        System.out.println("Task 4");
        return palindrome.equalsIgnoreCase(new StringBuilder(palindrome).reverse().toString());

        //if stringBuilder is not allowed

//        for (int i = 0; i < palindrome.length(); i++) {
//            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i-1)) {
//                return false;
//            }
//        }
//        return true;
    }


}
