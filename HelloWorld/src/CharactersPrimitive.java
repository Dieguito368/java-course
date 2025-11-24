public class CharactersPrimitive {
    public static void main(String[] args) {
        char character = '@';
        System.out.println("<------- CHAR -------> ");
        System.out.println("character = " + character);
        System.out.println("Bytes: " + Character.BYTES);
        System.out.println("Bits: " + Character.SIZE);
        System.out.println("Maximum value: " + Character.MAX_VALUE);
        System.out.println("Minimum value: " + Character.MIN_VALUE);

        char unicodeCharacter = '\u0040';
        System.out.println("unicodeCharacter = " + unicodeCharacter);

        char decimalCharacter = 64;
        System.out.println("decimalCharacter = " + decimalCharacter);

        var value = '@';

        System.out.println();

        System.out.println("/* Space */");
        // char space = ' ';
        char space = '\u0020';
        System.out.println("Hi" + space + space + "Programmer");

        System.out.println();

        System.out.println("/* Backspace */");
        char backspace = '\b';
        System.out.println("Hi Programmer" + backspace);

        System.out.println();

        System.out.println("/* Tabulator */");
        char tabulator = '\t';
        System.out.println("Hi" + tabulator + tabulator + "Programmer");

        System.out.println();

        System.out.println("/* Newline */");
        char newline = '\n';
        System.out.println("Hi" + newline + "Programmer");

        System.out.println();

        System.out.println("/* Carriage Return */");
        char carriageReturn = '\r';
        System.out.println("Hi" + carriageReturn + "Programmer");

        System.out.println();

        System.out.println("Hi" + System.getProperty("line.separator") + "Programmer");
        System.out.println("Hi" + System.lineSeparator() + "Programmer");
    }
}
