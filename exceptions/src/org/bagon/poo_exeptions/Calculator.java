package org.bagon.poo_exeptions;

public class Calculator {
    public double divide(int dividend, int divisor) throws DivisionByZeroException {
        if(divisor == 0) {
            throw new DivisionByZeroException("You cannot divide by zero!");
        }

        return (double) dividend / divisor;
    }

    public double divide(String dividend, String divisor) throws DivisionByZeroException, NumberFormatExcept {
        try {
            int integerDividend = Integer.parseInt(dividend);
            int integerDivisor = Integer.parseInt(divisor);

            return this.divide(integerDividend, integerDivisor);
        } catch (NumberFormatException e) {
            throw new NumberFormatExcept("You must enter a number in both the dividend and the divisor ");
        }
    }
}