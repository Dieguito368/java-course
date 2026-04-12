package org.bagon.java8.lamda;

import org.bagon.java8.lamda.arithmetic.Arithmetic;
import org.bagon.java8.lamda.arithmetic.Calculator;

public class FunctionalInterfaceMain {
    public static void main(String[] args) {
        Arithmetic addition = Double::sum;
        Arithmetic substraction = (a, b) -> a - b;
        Arithmetic multiplication = (a, b) -> a * b;;
        Arithmetic division = (a, b) -> a / b;;

        Calculator calculator = new Calculator();
        System.out.println("Addition: " + calculator.compute(1, 2, addition));
        System.out.println("Substraction: " + calculator.compute(10, 5, substraction));
    }
}
