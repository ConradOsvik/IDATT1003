package Oppgave2;

public class Main {
    public static void main(String[] args) {
        TextAnalysis textAnalysis = new TextAnalysis("aabcæøåå!?");
        System.out.println(textAnalysis.getSumOfUniqueLetters());
        System.out.println(textAnalysis.getSumOfAllLetters());
        System.out.println(textAnalysis.getPercentageOfTextNotLetters());
        System.out.println(textAnalysis.getSumOfLetter('æ'));
        System.out.println(textAnalysis.getMostLetters());
    }
}
