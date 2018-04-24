package by.itacademy;

import by.itacademy.calculator.exceptions.DivisionByZeroException;
import by.itacademy.calculator.exceptions.InvalidOperationException;
import java.util.Scanner;

public class Calculator {
   MyOperationFactory myOperationFactory;

   public Calculator(MyOperationFactory myOperationFactory){
       this.myOperationFactory = myOperationFactory;
    }

   public void exec() throws InvalidOperationException, DivisionByZeroException, Exception{
       boolean nextStep = true;
       Scanner scan = new Scanner(System.in);
       do {
           System.out.print( "Input first value\t" );
           double value1 = scan.nextDouble();
           System.out.println( "Choose operation:" );
           System.out.print( "1 - Addition\t" );
           System.out.print( "2 - Subtraction\t" );
           System.out.print( "3 - Multiplication\t" );
           System.out.print( "4 - Division\t" );
           System.out.print( "5 - Exponentiation\t" );
           System.out.print( "6 - Root of value\t\n" );
           int operand = scan.nextInt();
           System.out.print( "Input second value\t" );
           double value2 = scan.nextDouble();
           System.out.print( "Your result:\t" );
           Operation op = myOperationFactory.getOperation(operand);
           try{
               if (op == null) throw new InvalidOperationException("");
               else  System.out.println(op.exec(value1, value2));
           }catch (InvalidOperationException e){
               System.out.println("Invalid operation! Choose valid operation");
           }
           System.out.println("\nDo you want to continue?");
           System.out.print("1 - Continue\t");
           System.out.println("2 - Exit");
           int whatToDo = scan.nextInt();
           if (whatToDo == 2) nextStep = false;
       } while (nextStep);
   }
}