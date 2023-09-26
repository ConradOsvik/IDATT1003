package Oppgave1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final int[] antall = new int[10];
    private static final Random random = new Random();
    private static int i;
    private static int n;
    private static final Scanner input = new Scanner(System.in);

    private static void input(){
        System.out.println("How many times do you want the loop to run?");
        n = input.nextInt();
    }

    private static void run(){
        for(i = 0; i < n; i++){
            int tall = random.nextInt(10);
            antall[tall]++;
        }
    }

    private static void output(){
        System.out.println("The Loop ran: " + i + " times");
        System.out.println("These are the amount of numbers generated from 0-9:");
        System.out.println("0: " + antall[0]);
        System.out.println("1: " + antall[1]);
        System.out.println("2: " + antall[2]);
        System.out.println("3: " + antall[3]);
        System.out.println("4: " + antall[4]);
        System.out.println("5: " + antall[5]);
        System.out.println("6: " + antall[6]);
        System.out.println("7: " + antall[7]);
        System.out.println("8: " + antall[8]);
        System.out.println("9: " + antall[9]);
    }

    public static void main(String[] args) {
        input();
        run();
        output();
    }
}
