package edu.hillel.Homework8_Exceptions;

public class ArrayDataException extends Exception {
    private int i;
    private int j;

    public ArrayDataException(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
}
