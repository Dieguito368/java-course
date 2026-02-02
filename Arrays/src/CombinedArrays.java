public class CombinedArrays {
    public static void main(String[] args) {
        int[] a, b, c;

        int sizeArray = 8;
        int quantityNumbers = 4;

        a = new int[sizeArray];
        b = new int[sizeArray];
        c = new int[sizeArray * 2];

        for (int i = 0; i < sizeArray; i++) {
            a[i] = i + 1;
            b[i] = (i + 1) * 5;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }

        System.out.println();

        for (int i = 0; i < b.length; i++) {
            System.out.println("b[" + i + "] = " + b[i]);
        }

        System.out.println();

        int aux = 0;

        for(int i = 0; i < c.length / 2; i+=quantityNumbers) {
            for (int j = 0; j < quantityNumbers; j++) {
                c[aux++] = a[i + j];
            }

            for (int j = 0; j < quantityNumbers; j++) {
                c[aux++] = b[i + j];
            }
        }

        for (int i = 0; i < c.length; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }
    }
}
