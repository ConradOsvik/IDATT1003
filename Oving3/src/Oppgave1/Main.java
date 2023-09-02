package Oppgave1;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        String tabellStartInput = showInputDialog("hvilket tall skal tabellen starte på?");
        String tabellSluttInput = showInputDialog("hvilket tall skal tabellen slutte på?");

        try{
            int tabellStartInt = Integer.parseInt(tabellStartInput);
            int tabellSluttInt = Integer.parseInt(tabellSluttInput);

            for(int i = tabellStartInt; i <= tabellSluttInt; i++){
                System.out.println(i + "-gangen:");
                for(int j = 1; j <= 10; j++){
                    System.out.println(i + " x " + j + " = " + i*j);
                }
                System.out.println("");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
