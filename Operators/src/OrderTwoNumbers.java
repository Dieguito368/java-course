import javax.swing.*;

public class OrderTwoNumbers {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number: "));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number: "));
        
        String res = n1 > n2 ? n1 + "\n" + n2 : n2 + "\n" + n1;

        System.out.println(res);
    }
}
