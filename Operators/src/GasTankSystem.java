import javax.swing.*;

public class GasTankSystem {
    public static void main(String[] args) {
        String capacity = "";

        double liters = Double.parseDouble(JOptionPane.showInputDialog("Enter your tank capacity: "));

        capacity = liters == 70 ? "Full tank"
                : liters < 70 && liters >= 60 ? "Tank almost full"
                : liters < 60 && liters >= 40 ? "Tank 3/4"
                : liters < 40 && liters >= 35 ? "Half a tank"
                : liters < 35 && liters >= 20 ? "Enough"
                : liters < 20 && liters >= 1 ? "Insufficient"
                : "Invalid capacity";

        System.out.println("capacity = " + capacity);
    }
}
