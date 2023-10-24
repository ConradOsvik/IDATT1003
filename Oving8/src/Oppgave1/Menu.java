package Oppgave1;

import java.util.Scanner;

public class Menu {
    private static final Scanner scanner = new Scanner(System.in);
    private static int operation;
    private static Worker worker;

    private static void init(){
        System.out.println("type firstname: ");
        String firstName = scanner.nextLine();
        System.out.println("type lastname: ");
        String lastName = scanner.nextLine();
        System.out.println("type birthyear: ");
        int birthYear = scanner.nextInt();
        System.out.println("type worker number: ");
        int workerNr = scanner.nextInt();
        System.out.println("type hiring year: ");
        int hiringYear = scanner.nextInt();
        System.out.println("type monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        System.out.println("type taxrate: ");
        double taxRate = scanner.nextDouble();

        worker = new Worker(firstName, lastName, birthYear, workerNr, hiringYear, monthlySalary, taxRate);
    }

    private static void input(){
        try{
            System.out.println("Select an operation");
            System.out.println("Update monthly salary: 1");
            System.out.println("Update tax rate: 2");
            System.out.println("Exit: 3");

            operation = scanner.nextInt();

            checkInput(operation);

            if(operation == 3){
                exit(0);
            }

        } catch (Exception e) {
            System.out.println("Invalid input, input must be an integer between 1 and 3");
            input();
        }
    }

    private static void checkInput(int number) throws IllegalArgumentException{
        if(number < 1 || number > 3){
            throw new IllegalArgumentException("Invalid input, input must be an integer between 1 and 3");
        }
    }

    private static void run(){
        switch(operation){
            case 1:
                System.out.println("type new monthly salary: ");
                double newMonthlySalary = scanner.nextDouble();
                worker.setMonthlySalary(newMonthlySalary);
                break;

            case 2:
                System.out.println("type new tax rate: ");
                double newTaxRate = scanner.nextDouble();
                worker.setTaxRate(newTaxRate);
                break;
        }
    }

    private static void output(){
        System.out.println("Current data: ");
        System.out.println(worker);
    }

    private static void exit(int status){
        System.exit(status);
    }
    public static void main(String[] args) {
        init();

        while(true){
            input();
            run();
            output();
        }
    }
}
