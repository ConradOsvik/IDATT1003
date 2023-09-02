package Oppgave2;

import java.lang.Math;
import java.util.Scanner;

public class Main {
    static boolean findPrime(int num){
        if(num == 1 || num == 2) return true;
        if(num % 2 == 0) return false;

        for(int i = 3; i <= Math.sqrt(num); i += 2){
            if(num % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        do{
            try{
                Scanner input = new Scanner(System.in);

                System.out.println("Skriv 'exit' for å avslutte");
                System.out.println("Skriv inn et tall for analyse:");

                String textInput = input.nextLine();
                if(textInput.equals("exit")) break;

                int num = Integer.parseInt(textInput);
                boolean isPrime = findPrime(num);

                if(isPrime) System.out.println(num + " is a prime!");
                else System.out.println(num + " is not a prime!");
            } catch (Exception e){
                System.out.println(e);
            }
        } while (true);

        /*
        String numInput = showInputDialog("skriv et tall");
        int num = Integer.parseInt(numInput);
        boolean isPrime = findPrime(num);

        if(isPrime) showMessageDialog(null, num + " is a prime!");
        else showMessageDialog(null, num + " is not a prime!");
        */
    }
}
