package by.itacademy.calculator.operations;

import by.itacademy.Operation;

public class OperationSubtraction implements Operation {

    @Override
    public double exec(double valueOne, double valueTwo) {
        System.out.print( valueOne + " - " + valueTwo + " = ");
        return (valueOne - valueTwo);
    }
}