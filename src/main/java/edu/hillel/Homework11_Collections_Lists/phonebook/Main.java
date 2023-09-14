package edu.hillel.Homework11_Collections_Lists.phonebook;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        Entry entry1 = new Entry("Alex", "+1409534451");
        Entry entry2 = new Entry("Alex", "+5609576481");
        Entry entry3 = new Entry("Bob", "+4109536759");
        Entry entry4 = new Entry("Dave", "+5306744401");
        Entry entry5 = new Entry("John", "+3809534678");

        phoneBook.add(entry1);
        phoneBook.add(entry2);
        phoneBook.add(entry3);
        phoneBook.add(entry4);
        phoneBook.add(entry5);

        phoneBook.find("Dave");
        System.out.println();
        phoneBook.findAll("Alex");
    }


}
