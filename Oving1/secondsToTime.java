import static javax.swing.JOptionPane.*;

class SecondsToTime {
    public static void main(String[] args){
        String secondsInput = showInputDialog("Enter the number of seconds: ");
        int absSeconds = Integer.parseInt(secondsInput);
        int hours = absSeconds / 3600;
        int minutes = (absSeconds / 60) % 60;
        int seconds = absSeconds % 60;

        showMessageDialog(null, "The time is: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds.");
    }   
}
