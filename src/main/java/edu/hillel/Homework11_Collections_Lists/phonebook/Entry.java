package edu.hillel.Homework11_Collections_Lists.phonebook;

public class Entry {
    private final String name;
    private final String phoneNumber;

    public Entry(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
