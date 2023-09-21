package edu.hillel.Homework8_Exceptions;

public class Main {
    public static void main (String[] args) throws ArraySizeException, ArrayDataException {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        String [][] stringArray = new String[][]{{"1","2","3","4"},{"1","2","3","4"},
                {"1","2","3","4"},{"1","2","t","4"}};
        try{
            System.out.print(arrayValueCalculator.doCalc(stringArray));
        }catch (ArraySizeException | ArrayDataException e){
            System.out.println(e.getMessage());
        }

    }
}
