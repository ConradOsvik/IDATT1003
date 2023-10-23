package Oppgave1;

public final class ExtendedString {
    private final String string;
    public ExtendedString(String string){
        this.string = string;
    }

    public String getString(){
        return this.string;
    }

    public String shorten(){
        String[] words = this.string.split(" ");

        StringBuilder result = new StringBuilder("");

        for (String word : words) {
            result.append(word.charAt(0));
        }

        return result.toString();
    }

    public String removeLetter(char letter){
        return this.string.replace(Character.toString(letter), "");
    }
}