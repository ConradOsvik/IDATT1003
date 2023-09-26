package Oppgave2;

import java.util.Arrays;

public class TextAnalysis {
    private final int[] antallTegn = new int[30];
    private final String text;

    public TextAnalysis(String text){
        this.text = text;

        char[] ch = text.toLowerCase().toCharArray();

        for(char c: ch){
            int temp = (int) c;
            int temp_integer = 96;
            if(temp <=122 & temp >= 97){
                this.antallTegn[temp-temp_integer]++;
            } else{
                this.antallTegn[29]++;
            }
        }

        System.out.println(Arrays.toString(antallTegn));
    }

    private char getChar(int i){
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";
        return alphabet.charAt(index);
    }

    public int getTextLength(){
        return this.text.length();
    }

    public int getAmountOfDifferentLetters(){
        return this.text.replaceAll("[^a-zA-Z]", "").toLowerCase().chars().distinct().toArray().length;
    }

    public int getSumOfAllLetters(){
        return this.text.replaceAll("[^a-zA-Z]", "").length();
    }

    public double getPercentageOfTextNotLetters(){
        return (double) (this.getTextLength() - this.getSumOfAllLetters()) / this.getTextLength() * 100;
    }

    public int getAmountOfLetter(char letter){
        return this.antallTegn[(int) letter - 96];
    }

    public int getMostLetters(){
        return Arrays.stream(this.antallTegn).max().getAsInt();
    }
}
