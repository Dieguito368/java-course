public class Calculator {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.err.println("You must enter 3 arguments: (operation, number 1, number 2)");
            System.exit(-1);
        }

        String operation = args[0];

        int n1 = 0;
        int n2 = 0;
        double res = 0.00;

        try {
            n1 = Integer.parseInt(args[1]);
            n2 = Integer.parseInt(args[2]);
        } catch (NumberFormatException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(-1);
        }

        switch (operation) {
            case "addition":
                res = n1 + n2;
                break;
            case "substraction":
                res = n1 - n2;
                break;
            case "multiplication":
                res = n1 * n2;
                break;
            case "division":
                if(n2 == 0) {
                    System.err.println("Zero is not divisible");
                    System.exit(-1);
                }
                
                res = (double) n1 / n2;
                break;
            default:
                System.err.println("Invalid Operation");
                break;
        }

        System.out.println("Result = " + res);
    }
}
