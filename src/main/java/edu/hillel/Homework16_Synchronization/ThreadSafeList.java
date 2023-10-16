package edu.hillel.Homework16_Synchronization;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ThreadSafeList<T> {
    private final List<T> list = new CopyOnWriteArrayList<>();

    public void add(T item) {
        list.add(item);
    }

    public void remove(T item) {
        list.remove(item);
    }

    public T get(int index) {
        return list.get(index);
    }

    @Override
    public String toString() {
        return "ThreadSafeList{" +
                "list=" + list +
                '}';
    }
}
