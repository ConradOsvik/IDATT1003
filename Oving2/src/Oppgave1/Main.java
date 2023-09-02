package Oppgave1;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        String yearInput = showInputDialog("Skriv inn et årstall");
        int year = Integer.parseInt(yearInput);

        if(year % 100 == 0){
            if(year % 400 == 0) showMessageDialog(null, "hundreår skuddår!");
            else{
                showMessageDialog(null, "ikke skuddår!");
            }
        } else{
            if(year % 4 == 0) {
                showMessageDialog(null, "vanlig skuddår!");
            } else{
                showMessageDialog(null, "ikke skuddår!");
            }
        }
    }
}
