package by.itacademy;

//import by.itacademy.calculator.exceptions.DivisionByZeroException;
//import by.itacademy.calculator.exceptions.InvalidOperationException;

import by.itacademy.calculator.exceptions.DivisionByZeroException;
import by.itacademy.calculator.exceptions.InvalidOperationException;

public class Main {
    public static void main(String[] args) throws InvalidOperationException, DivisionByZeroException, Exception{
        MyOperationFactory myOperationFactory = new MyOperationFactory();
        Calculator calculator = new Calculator(myOperationFactory);
        try {
            calculator.exec();
        } catch (InvalidOperationException | DivisionByZeroException | ArithmeticException e) {
            e.printStackTrace();
        }
    }
}