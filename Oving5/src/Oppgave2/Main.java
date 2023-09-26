package Oppgave2;

public class Main {
    private static final ExtendedRandom random = new ExtendedRandom();

    public static void main(String[] args) {
        System.out.println(random.nextInt(1, 10));
        System.out.println(random.nextInt(20, 35));
        System.out.println(random.nextDouble(0, 1));
        System.out.println(random.nextInt(1, 0));
    }
}
