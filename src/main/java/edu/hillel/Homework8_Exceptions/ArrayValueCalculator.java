package edu.hillel.Homework8_Exceptions;
public class ArrayValueCalculator {
    public int doCalc(String[][] stringArray) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray.length != 4 || stringArray[i].length != 4) {
                throw new ArraySizeException("Incorrect Array Size.");
            }
            for (int j = 0; j < stringArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(stringArray[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("Cell (" + i + "x" + j + ") contains incorrect Data Type.");
                    throw new ArrayDataException("Incorrect Data Type.\n" + e);
                }

            }
        }
        return sum;
    }

}
