package by.itacademy.calculator.operations;

import by.itacademy.Operation;

public class OperationRoot implements Operation{

    @Override
    public double exec(double valueOne, double valueTwo) throws ArithmeticException {
       try {
           if (valueTwo == 0) throw new ArithmeticException();
           else System.out.print( "Root of the " + valueTwo + "th degree of value " + valueOne + " = " );
        } catch (ArithmeticException e) {
           e.getMessage();
           //System.out.println("Its impossible to extract the root to zero degree");
        }
        return Math.pow( valueOne, 1 / valueTwo );
    }
}