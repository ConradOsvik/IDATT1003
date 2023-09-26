package Oppgave2;

import java.util.Random;

public class Player {
    private final Random dice = new Random();
    private int points = 0;
    private String name = "";

    public Player(String name){
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public String getName(){
        return name;
    }

    public void rollDice(){
        int diceRoll = dice.nextInt(6) + 1;

        System.out.println(name + " rolled " + diceRoll + ".");

        if(diceRoll == 1){
            points = 0;
        } else {
            if(points + diceRoll > 100){
                points -= diceRoll;
            } else{
                points += diceRoll;
            }

        }

        if(points == 100){
            System.out.println(name + " won!");
        }
    }
}
