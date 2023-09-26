package Oppgave2;

import java.util.Random;

public class ExtendedRandom {
    private final Random random = new Random();

    public int nextInt(int min, int max) throws IllegalArgumentException {
        if(min > max) throw new IllegalArgumentException("The maximum value must be greater than or even the minimum value");

        return random.nextInt(min, max + 1);
    }

    public double nextDouble(double min, double max) throws IllegalArgumentException {
        if(min > max) throw new IllegalArgumentException("The maximum value must be greater than or even the minimum value");

        return min + (max - min) * random.nextDouble();
    }
}