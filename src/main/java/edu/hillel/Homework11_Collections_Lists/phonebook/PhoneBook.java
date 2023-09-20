package edu.hillel.Homework11_Collections_Lists.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List<Entry> entryList;

    public PhoneBook() {
        entryList = new ArrayList<>();
    }

    public void add(Entry entry) {
        entryList.add(entry);
    }

    public Entry find(String name) {
        for (Entry entry : entryList) {
            if (entry.getName().equals(name)) {
                System.out.println("Entry found : " + entry.getName() + "," + entry.getPhoneNumber());
                return entry;
            }
        }
        System.out.println("No entries found");
        return null;
    }


    public List<Entry> findAll(String name) {
        List<Entry> foundEntries = new ArrayList<>();
        for (Entry entry : entryList) {
            if (entry.getName().equals(name)) {
                foundEntries.add(entry);
                System.out.println("Entry found : " + entry.getName() + "," + entry.getPhoneNumber());
            }
        }
        if (foundEntries.isEmpty()) {
            System.out.println("No entries found");
        }
        return null;
    }
}
