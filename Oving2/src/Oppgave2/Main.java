package Oppgave2;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;

public class Main {
    public static void main(String[] args) {
        double meatAPrice = 35.90;
        double meatAGrams = 450;
        double meatBPrice = 39.50;
        double meatBGrams = 500;
        double meatAPricePerGrams = meatAPrice / meatAGrams;
        double meatBPricePerGrams = meatBPrice / meatBGrams;

        DecimalFormat df = new DecimalFormat("#.####");

        if(meatAPricePerGrams < meatBPricePerGrams) showMessageDialog(null, "Meat A has the best price: " + df.format(meatAPricePerGrams) + "price per grams");
        if(meatBPricePerGrams < meatAPricePerGrams) showMessageDialog(null, "Meat B has the best price: " + df.format(meatBPricePerGrams) + "price per grams");
    }
}
