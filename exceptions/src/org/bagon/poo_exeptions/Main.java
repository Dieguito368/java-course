package org.bagon.poo_exeptions;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("<----- Division 1 ----->");
            Calculator calculator = new Calculator();
            double quotient1 = calculator.divide(10, 0);
            System.out.println(quotient1);

            System.out.println("<----- Division 2 ----->");
            double quotient2 = calculator.divide(10, 2);
            System.out.println(quotient2);

            System.out.println("<----- Division 3 ----->");
            double quotient3 = calculator.divide("5", "1");
            System.out.println(quotient3);

            System.out.println("<----- Division 4 ----->");
            double quotient4 = calculator.divide("r", "m");
            System.out.println(quotient4);
        } catch (NumberFormatExcept | DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}