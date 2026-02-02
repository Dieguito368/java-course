import java.util.Arrays;

public class MutableInverseArray {
    public static void main(String[] args) {
        String[] products = {
            "C22 Ultra Smart Watch",
            "Daisy Smartphone Black",
            "Foxx A551 Smartphone",
            "DMD‑T665 Nav Phone"
        };

        int total = products.length;

        Arrays.sort(products);

        System.out.println("Initial array");
        for(int i = 0; i < total; i++) {
            System.out.println("Product[" + i + "] = " + products[i]);
        }

        for(int i = 0; i < total / 2; i++) {
            String current = products[i];
            String reverse = products[total - 1 - i];

            products[i] = reverse;
            products[total - 1 - i] = current;
        }

        System.out.println();

        System.out.println("Final array");
        for(int i = 0; i < total; i++) {
            System.out.println("Product[" + i + "] = " + products[i]);
        }
    }
}