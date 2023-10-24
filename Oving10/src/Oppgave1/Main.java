package Oppgave1;

import java.util.Scanner;

public class Main {
    private static final ArrangementRegister arrangementRegister = new ArrangementRegister();
    private static final Scanner scanner = new Scanner(System.in);
    private static int input;

    private static void input(){
        try{
            System.out.println("Select an operation: ");
            System.out.println("1. Register arrangement");
            System.out.println("2. Find arrangement at place");
            System.out.println("3. Find arrangement at date");
            System.out.println("4. Find arrangement between dates");
            System.out.println("5. Get all arrangements sorted by place");
            System.out.println("6. Get all arrangements sorted by type");
            System.out.println("7. Get all arrangements sorted by date");
            System.out.println("8. Exit");

            input = Integer.parseInt(scanner.nextLine());
            checkInput(input);

            if(input == 8){
                exit(0);
            }
        }catch(IllegalArgumentException e){
            System.out.println("Invalid input, input must be integer between 1 and 8");
            input();
        }
    }

    private static void checkInput(int input){
        if(input < 1 || input > 8){
            throw new IllegalArgumentException("Invalid input, input must be integer between 1 and 8");
        }
    }

    private static void output(){
        switch(input){
            case 1:
                System.out.println("Type arrangement number");
                int number = Integer.parseInt(scanner.nextLine());
                System.out.println("Type arrangement name");
                String name = scanner.nextLine();
                System.out.println("Type arrangement place");
                String place = scanner.nextLine();
                System.out.println("Type arrangement organizer");
                String organizer = scanner.nextLine();
                System.out.println("Type arrangement type");
                String type = scanner.nextLine();
                System.out.println("Type arrangement date");
                long date = Long.parseLong(scanner.nextLine());

                arrangementRegister.registerArrangement(number, name, place, organizer, type, date);
            break;
            case 2:
                System.out.println("Type place");
                String placeToFind = scanner.nextLine();

                System.out.println(arrangementRegister.findArrangementsAtPlace(placeToFind));
            break;
            case 3:
                System.out.println("Type date");
                int dateToFind = Integer.parseInt(scanner.nextLine());

                System.out.println(arrangementRegister.findArrangementsAtDate(dateToFind));
            break;
            case 4:
                System.out.println("Type start date");
                int startDate = Integer.parseInt(scanner.nextLine());
                System.out.println("Type end date");
                int endDate = Integer.parseInt(scanner.nextLine());

                System.out.println(arrangementRegister.findArrangementsBetweenDates(startDate, endDate));
            break;
            case 5:
                System.out.println(arrangementRegister.arrangementsSortedByPlace());
            break;
            case 6:
                System.out.println(arrangementRegister.arrangementsSortedByType());
            break;
            case 7:
                System.out.println(arrangementRegister.arrangementsSortedByDate());
            break;
        }
    }

    private static void exit(int status){
        System.exit(status);
    }
    public static void main(String[] args) {
        while(true) {
            input();
            output();
        }
    }
}
