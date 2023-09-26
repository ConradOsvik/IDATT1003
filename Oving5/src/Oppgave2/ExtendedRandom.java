package Oppgave2;

import java.util.Random;

public class ExtendedRandom {
    private final Random random = new Random();

    public int nextInt(int min, int max) {
        return random.nextInt(min, max + 1);
    }

    public double nextDouble() {
        return random.nextDouble();
    }
}