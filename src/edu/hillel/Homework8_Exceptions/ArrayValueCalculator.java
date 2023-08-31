package edu.hillel.Homework8_Exceptions;

import java.util.Arrays;

public class ArrayValueCalculator {
    public int doCalc(String[][] stringArray) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray.length != 4 || stringArray[i].length != 4) {
                throw new ArraySizeException();
            }
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(stringArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException(i, j);
                }

            }
        }
        return sum;
    }

}
