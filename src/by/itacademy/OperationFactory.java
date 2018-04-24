package by.itacademy;

import by.itacademy.calculator.exceptions.InvalidOperationException;

public interface OperationFactory {
    Operation getOperation (int operand) throws InvalidOperationException;
}