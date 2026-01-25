public class AutoboxingInteger {
    public static void main(String[] args) {
        Integer[] whole = { Integer.valueOf(1), 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int res = 0;

        for (Integer i: whole) {
            if(i.intValue() % 2 == 0) {
                res += i.intValue();
            }
        }

        System.out.println("res = " + res);
    }
}
