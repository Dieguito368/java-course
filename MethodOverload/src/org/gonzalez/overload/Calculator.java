package org.gonzalez.overload;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int... args) {
        int total = 0;

        for(int i : args) {
            total += i;
        }

        return total;
    }

    public static float add(float a, int... args) {
        float total = a ;

        for(int i : args) {
            total += i;
        }

        return total;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static float add(int a, float b) {
        return a + b;
    }

    public static float add(float a, int b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int add(String a, String b) {
        int result;

        try {
            result = Integer.parseInt(a) + Integer.parseInt(b);
        } catch (NumberFormatException e) {
             result = 0;
        }

        return result;
    }

    public static int add(int a, int b, int c) {
        return  a + b + c;
    }
}