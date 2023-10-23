package Oppgave2;

public final class TextAnalysis {
    private final String text;

    public TextAnalysis(String text){
        this.text = text;
    }

    public String getText(){
        return this.text;
    }

    public String getTextUpperCase(){
        return this.text.toUpperCase();
    }

    public int getCount(){
        return this.text.split(" ").length;
    }

    public double getAverageWordLength(){
        String[] words = this.text.split(" ");
        double avgLength = 0;

        for(String word : words){
            avgLength += word.length();
        }

        avgLength /= words.length;

        return avgLength;
    }

    public double getAverageWordsPerPeriod(){
        String[] periods = this.text.split("[.!:?]");
        double avgLengthPerPeriod = 0;

        for(String period : periods){
            avgLengthPerPeriod += period.split(" ").length;
        }

        avgLengthPerPeriod /= periods.length;

        return avgLengthPerPeriod;
    }

    public String swapWord(String word, String newWord){
        return this.text.replaceAll(word, newWord);
    }
}
