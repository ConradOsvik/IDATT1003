package Oppgave1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Currency dollar = new Currency("Dollar", 8.5);
    private static final Currency euro = new Currency("Euro", 10.2);
    private static final Currency pound = new Currency("Pound", 11.8);
    private static final ArrayList<Currency> currencies = new ArrayList<>();
    private static int userInput = 0;

    private static void init(){
        currencies.add(dollar);
        currencies.add(euro);
        currencies.add(pound);
    }

    private static void input(){
        try{
            System.out.println("Select currency:");
            System.out.println("1: Dollar");
            System.out.println("2: Euro");
            System.out.println("3: Pound");
            System.out.println("4: Exit");

            userInput = scanner.nextInt();

            if(userInput == 4){
                exit(0);
            }

        } catch (Exception e){
            System.out.println("Invalid input, input must be an integer between 1 and 4");
            scanner.next();
            input();
        }
    }

    private static void output(){
        Currency currency = currencies.get(userInput - 1);

        System.out.println("Selected currency: " + currency.getName());
        System.out.println("Enter amount to convert: ");

        double amount = scanner.nextDouble();
        double convertedAmount = currency.convertToNok(amount);

        System.out.println("Converted amount: " + convertedAmount + "NOK");
    }

    private static void exit(int status){
        System.exit(status);
    }

    public static void main(String[] args) {
        init();

        while(true){
            input();
            output();
        }
    }
}
