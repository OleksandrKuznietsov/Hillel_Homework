package edu.hillel.Homework8_Exceptions;

public class Main {
    public static void main (String[] args) throws ArraySizeException, ArrayDataException {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        String [][] stringArray = new String[][]{{"1","2","3","4"},{"1","2","3","4"},
                {"1","2","3","4"},{"1","2","3","4"}};
        try{
            System.out.print(arrayValueCalculator.doCalc(stringArray));
        }catch (ArraySizeException e){
            System.out.println("Incorrect Array Size.");
        }catch (ArrayDataException e){
            System.out.println("Cell (" + e.getI() + "x" + e.getJ() + ") contains incorrect Data Type.");
        }catch (NullPointerException e){
            System.out.println("String argument is null");
        }catch (NumberFormatException e){
            System.out.println("Incorrect number format.");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Index is out of bounds.");
        }
    }
}
