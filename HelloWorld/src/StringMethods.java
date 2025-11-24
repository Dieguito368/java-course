public class StringMethods {
    public static void main(String[] args) {
        String name = "Diego";

        System.out.println("name.length() = " + name.length());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.equals(\"Diego\") = " + name.equals("Diego"));
        System.out.println("name.compareToIgnoreCase(\"diego\") = " + name.equalsIgnoreCase("diego"));
        System.out.println("name.compareTo(\"Diego\") = " + name.compareTo("Diego"));
        System.out.println("name.compareTo(\"diego\") = " + name.compareTo("diego"));
        System.out.println("name.charAt(0) = " + name.charAt(0));
        System.out.println("name.charAt(1) = " + name.charAt(1));
        System.out.println("name.charAt(name.length() - 1) = " + name.charAt(name.length() - 1));
        System.out.println("name.substring(1) = " + name.substring(1));
        System.out.println("name.substring(1, 3) = " + name.substring(1, 3));
        System.out.println("name.substring(name.length() - 1, name.length()) = " + name.substring(name.length() - 1, name.length()));

        String word = "Abracadabra";

        System.out.println("word.replace(\"a\", \".\")" + word.replace("a", "."));
        System.out.println("word.indexOf(\"A\") = " + word.indexOf("A"));
        System.out.println("word.lastIndexOf(\"a\") = " + word.lastIndexOf("a"));
        System.out.println("word.lastIndexOf(\"z\") = " + word.lastIndexOf("z"));
        System.out.println("word.contains(\"A\") = " + word.contains("A"));
        System.out.println("word.startsWith(\"Abra\") = " + word.startsWith("Abra"));
        System.out.println("word.startsWith(\"Abrado\") = " + word.startsWith("Abrado"));
        System.out.println("word.endsWith(\"bra\") = " + word.endsWith("bra"));
        System.out.println("  Abracadabra   ");
        System.out.println("  Abracadabra   ".trim());
    }
}
