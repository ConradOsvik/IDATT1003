package Oppgave2;

import java.util.ArrayList;
import java.util.Arrays;

public class TextAnalysis {
    private final int[] numberOfChars = new int[30];
    private final String text;
    private final int charIndexStartValue = 97;

    public TextAnalysis(String text){
        this.text = text;

        char[] ch = text.toLowerCase().toCharArray();

        for(char c: ch){
            int charCode = (int) c;
            if(charCode >= 97 && charCode <= 122){
                this.numberOfChars[charCode - this.charIndexStartValue]++;
            }
            else if(c == 'æ'){
                this.numberOfChars[26]++;
            }
            else if(c == 'ø'){
                this.numberOfChars[27]++;
            }
            else if(c == 'å'){
                this.numberOfChars[28]++;
            }
            else{
                this.numberOfChars[29]++;
            }
        }
        System.out.println(Arrays.toString(this.numberOfChars));
    }

    private char getChar(int i){
        String alphabet = "abcdefghijklmnopqrstuvwxyzæøå";
        return alphabet.charAt(i);
    }

    public int getTextLength(){
        return this.text.length();
    }

    public int getSumOfUniqueLetters(){
        int uniqueChars = 0;

        for(int i = 0; i < this.numberOfChars.length - 1; i++){
            if(this.numberOfChars[i] > 0) uniqueChars++;
        }

        return uniqueChars;
    }

    public int getSumOfAllLetters(){
        int allChars = 0;

        for(int i = 0; i < this.numberOfChars.length - 1; i++){
            allChars += this.numberOfChars[i];
        }

        return allChars;
    }

    public double getPercentageOfTextNotLetters(){
        return (double) (this.getTextLength() - this.getSumOfAllLetters()) / this.getTextLength() * 100;
    }

    public int getSumOfLetter(char letter){
        if(letter == 'æ') return this.numberOfChars[26];
        if(letter == 'ø') return this.numberOfChars[27];
        if(letter == 'å') return this.numberOfChars[28];

        return this.numberOfChars[(int) letter - this.charIndexStartValue];
    }

    public ArrayList<Character> getMostLetters(){
        int curMax = 0;
        ArrayList<Character> mostLetters = new ArrayList<Character>();

        for(int i = 0; i < this.numberOfChars.length - 1; i++){
            if(this.numberOfChars[i] > curMax){
                curMax = this.numberOfChars[i];
                mostLetters.clear();
                mostLetters.add(getChar(i));
            }
            else if(this.numberOfChars[i] == curMax){
                mostLetters.add(getChar(i));
            }
        }

        return mostLetters;
    }
}
