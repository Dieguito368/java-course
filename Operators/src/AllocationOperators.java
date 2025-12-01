public class AllocationOperators {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        i += 2;
        System.out.println("i = " + i);

        i += 5;
        System.out.println("i = " + i);

        i -= 1;
        System.out.println("i = " + i);

        i *= 3;
        System.out.println("i = " + i);

        String sql = "SELECT * FROM users where id = ";
        sql += "'1234567890'";

        System.out.println("sql = " + sql);
    }
}
