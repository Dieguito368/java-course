public class Arguments {
    public static void main(String[] args) {
        if(args.length == 0) {
            System.err.println("You must enter arguments.");
            System.exit(1);
        }

        for(int i = 0; i < args.length; i++) {
            System.out.println("Argument no. " + (i + 1) + " => " + args[i]);
        }
    }
}