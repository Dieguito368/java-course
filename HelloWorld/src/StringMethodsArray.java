public class StringMethodsArray {
    public static void main(String[] args) {
        String word = "Abracadabra";

        char[] array = word.toCharArray();

        for(int i = 0; i < array.length; i++) {
            System.out.println("arreglo[" + i + "] = " + array[i]);
        }

        String[] array2 = word.split("a");

        System.out.println();

        for(int i = 0; i < array2.length; i++) {
            System.out.println("arreglo[" + i + "] = " + array2[i]);
        }

        System.out.println();

        String archive = "credentials.officemax.v2.xml";

        String[] array3 = archive.split("[.]");

        System.out.println("extension:" + array3[array3.length - 1]);
    }
}