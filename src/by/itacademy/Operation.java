package by.itacademy;

import by.itacademy.calculator.exceptions.DivisionByZeroException;

public interface Operation{
    double exec (double valueOne, double valueTwo) throws DivisionByZeroException, Exception;
}