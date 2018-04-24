package by.itacademy;

import by.itacademy.calculator.exceptions.InvalidOperationException;
import by.itacademy.calculator.operations.*;

public class MyOperationFactory implements OperationFactory {
    private Operation operation;
    private int operationSymbol;

    @Override
    public Operation getOperation(int operand) throws InvalidOperationException{
        this.operationSymbol = operand;
            switch (operationSymbol) {
                case 1:
                    operation = new OperationAddition();
                    break;
                case 2:
                    operation = new OperationSubtraction();
                    break;
                case 3:
                    operation = new OperationMultiplication();
                    break;
                case 4:
                    operation = new OperationDivision();
                    break;
                case 5:
                    operation = new OperationExponentiation();
                    break;
                case 6:
                    operation = new OperationRoot();
                    break;
                default:
                    operation = null;
            }
        return operation;
    }
}