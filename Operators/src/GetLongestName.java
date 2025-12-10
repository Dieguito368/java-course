import javax.swing.*;

public class GetLongestName {
    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Enter the first name: ");
        String name2 = JOptionPane.showInputDialog("Enter the second name: ");
        String name3 = JOptionPane.showInputDialog("Enter the third name: ");

        int first1 = name1.split(" ")[0].length();
        int first2 = name2.split(" ")[0].length();
        int first3 = name3.split(" ")[0].length();

        String longerName = name1;
        int maxLength = first1;

        if(first2 > maxLength) {
            longerName = name2;
            maxLength = first2;
        }

        if(first3 > maxLength) {
            longerName = name3;
        }

        System.out.println(longerName + " has the longest name");
    }
}
