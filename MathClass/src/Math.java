public class Math {
    public static void main(String[] args) {
        int absolute = java.lang.Math.abs(-1);
        System.out.println("absolute = " + absolute);

        absolute = java.lang.Math.abs(3);
        System.out.println("absolute = " + absolute);

        double max = java.lang.Math.max(3.5, 1.2);
        System.out.println("max = " + max);

        double min = java.lang.Math.min(3.5, 1.2);
        System.out.println("min = " + min);

        double top = java.lang.Math.ceil(3.5);
        System.out.println("top = " + top);

        double bottom = java.lang.Math.floor(3.5);
        System.out.println("bottom = " + bottom);

        long rounding = java.lang.Math.round(3.6);
        System.out.println("rounding = " + rounding);

        long pi = java.lang.Math.round(java.lang.Math.PI);
        System.out.println("pi = " + pi);

        double exp = java.lang.Math.exp(1);
        System.out.println("exp = " + exp);
        
        double log = java.lang.Math.log(10);
        System.out.println("log = " + log);

        double pow = java.lang.Math.pow(10, 2);
        System.out.println("pow = " + pow);

        double sqrt = java.lang.Math.sqrt(10);
        System.out.println("sqrt = " + sqrt);

        double grades = java.lang.Math.toDegrees(1.57);
        grades = java.lang.Math.round(grades);
        System.out.println("grades = " + grades);

        double radians = java.lang.Math.toRadians(90.00);
        System.out.println("radians = " + radians);

        System.out.println("sin(90) = " + java.lang.Math.sin(radians));
        System.out.println("cos(90) = " + java.lang.Math.cos(radians));

        radians = java.lang.Math.toRadians(180.00);
        System.out.println("sin(180) = " + java.lang.Math.sin(radians));
        System.out.println("cos(180) = " + java.lang.Math.cos(radians));

        radians = java.lang.Math.toRadians(0.00);
        System.out.println("sin(0) = " + java.lang.Math.sin(radians));
        System.out.println("cos(0) = " + java.lang.Math.cos(radians));
    }
}