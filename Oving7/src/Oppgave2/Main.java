package Oppgave2;

public class Main {
    public static void main(String[] args) {
        TextAnalysis text = new TextAnalysis("The quick brown fox jumps over a lazy dog");

        System.out.println(text.getText());
        System.out.println(text.getTextUpperCase());
        System.out.println(text.getCount());
        System.out.println(text.getAverageWordLength());
        System.out.println(text.getAverageWordsPerPeriod());
        System.out.println(text.swapWord("fox", "dog"));
    }
}
