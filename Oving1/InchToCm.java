import static javax.swing.JOptionPane.*;

class InchToCm {
    public static void main(String[] args) {
        String inchInput = showInputDialog("Enter the number of inches: ");
        double inches = Double.parseDouble(inchInput);
        double cm = inches * 2.54;
        showMessageDialog(null, inches + " inches is " + cm + " centimeters.");
    }
}