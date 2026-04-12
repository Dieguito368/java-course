package org.bagon.java8.lamda.arithmetic;

public class Calculator {
    public double  compute(double a, double b, Arithmetic lamda) {
        return lamda.operation(a, b);
    }
}
