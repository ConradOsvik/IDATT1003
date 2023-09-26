package Oppgave1;

public class Main {
    private static final FractionCalculator fraction1 = new FractionCalculator(1, 2);
    private static final FractionCalculator fraction2 = new FractionCalculator(3, 4);

    public static void main(String[] args) {
        fraction1.add(2,3);
        System.out.println(fraction1.getFraction());

        fraction2.divide(1,8);
        System.out.println(fraction2.getFraction());
    }
}
