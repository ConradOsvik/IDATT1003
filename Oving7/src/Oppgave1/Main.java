package Oppgave1;

public class Main {
    public static void main(String[] args) {
        ExtendedString string = new ExtendedString("Hello World");

        System.out.println(string.getString());
        System.out.println(string.shorten());
        System.out.println(string.removeLetter('l'));
    }
}
