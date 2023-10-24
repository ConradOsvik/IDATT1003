package Oppgave2;

import java.util.Arrays;

public class Main {
    private static final Register register = new Register();
    public static void main(String[] args) {
        register.registerDish("Pizza", "Main", 100);
        register.registerDish("Pasta", "Main", 80);
        register.registerDish("Salad", "Main", 50);
        register.registerDish("Ice cream", "Dessert", 30);
        register.registerDish("Cake", "Dessert", 40);
        register.registerDish("Coke", "Drink", 20);
        register.registerDish("Water", "Drink", 10);

        register.registerNewMenu("Menu 1", new String[]{"Pizza", "Ice cream", "Coke"});
        register.registerNewMenu("Menu 2", new String[]{"Pasta", "Cake", "Water"});
        register.registerNewMenu("Menu 3", new String[]{"Salad", "Ice cream", "Coke"});

        System.out.println(register.findDishesByType("Main"));
        System.out.println(Arrays.toString(register.findMenusBasedOnTotalPrice(120, 200)));
    }
}
