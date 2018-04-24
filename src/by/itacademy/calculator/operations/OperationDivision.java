package by.itacademy.calculator.operations;

import by.itacademy.Operation;
import by.itacademy.calculator.exceptions.DivisionByZeroException;

public class OperationDivision implements Operation{

    @Override
    public double exec(double valueOne, double valueTwo) throws DivisionByZeroException{
       try {
           if (valueTwo == 0.0) throw new DivisionByZeroException("");
           else System.out.print( valueOne + " / " + valueTwo + " = ");
       }catch (DivisionByZeroException e){
           System.out.println("Division by zero is forbidden!");
       }

       return (valueOne / valueTwo);
    }
}