package Oppgave1;

import java.util.Scanner;

public class Menu {
    private static TaskOverview taskOverview = new TaskOverview();
    private static Scanner scanner = new Scanner(System.in);
    private static int input;

    private static void input(){
        try{
            System.out.println("Select an option:");
            System.out.println("1. Get registered students");
            System.out.println("2. Get done tasks by student");
            System.out.println("3. Add student");
            System.out.println("4. Add done tasks to student");
            System.out.println("5. Exit");

            input = Integer.parseInt(scanner.nextLine());
            checkInput(input);

            if(input == 5){
                exit(0);
            }
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            input();
        }
    }

    private static void checkInput(int input) throws IllegalArgumentException{
        if(input < 1 || input > 5){
            throw new IllegalArgumentException("Input must be an integer between 1 and 5");
        }
    }

    private static void output(){
        switch(input){
            case 1:
                if(taskOverview.getRegisteredStudents().isEmpty()){
                    System.out.println("No students registered");
                    break;
                }
                System.out.println(taskOverview.getRegisteredStudents());
                break;

            case 2:
                System.out.println("Enter the name of the student:");
                String name = scanner.nextLine();
                System.out.println(taskOverview.getTasksByStudent(name));
                break;

            case 3:
                System.out.println("Enter the name of the student:");
                name = scanner.nextLine();
                System.out.println("Enter the amount of tasks done:");
                int tasks = Integer.parseInt(scanner.nextLine());
                taskOverview.addStudent(name, tasks);
                break;

            case 4:
                System.out.println("Enter the name of the student:");
                name = scanner.nextLine();
                System.out.println("Enter the amount of tasks done:");
                tasks = Integer.parseInt(scanner.nextLine());
                taskOverview.addTasksToStudent(name, tasks);
                break;
        }
    }

    private static void exit(int status){
        System.exit(status);
    }
    public static void main(String[] args) {
        while(true){
            input();
            output();
        }
    }
}
