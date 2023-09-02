import static javax.swing.JOptionPane.*;

class TimeToAbsSeconds {
    public static void main(String[] args){
        String hourInput = showInputDialog("Enter the number of hours: ");
        String minuteInput = showInputDialog("Enter the number of minutes: ");
        String secondInput = showInputDialog("Enter the number of seconds: ");
        int hours = Integer.parseInt(hourInput);
        int minutes = Integer.parseInt(minuteInput);
        int seconds = Integer.parseInt(secondInput);

        int absSeconds = hours * 3600 + minutes * 60 + seconds;

        showMessageDialog(null, "The number of seconds is " + absSeconds + ".");
    }
}