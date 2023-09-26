package Oppgave2;

public class Main {
    public static void main(String[] args) {
        TextAnalysis textAnalysis = new TextAnalysis("Hello World!");
        System.out.println(textAnalysis.getAmountOfDifferentLetters());
        System.out.println(textAnalysis.getSumOfAllLetters());
        System.out.println(textAnalysis.getPercentageOfTextNotLetters());
        System.out.println(textAnalysis.getAmountOfLetter('l'));
        System.out.println(textAnalysis.getMostLetters());
    }
}
