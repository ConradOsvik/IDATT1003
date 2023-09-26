package Oppgave2;

public class Main {
    private static int roundNumber = 1;
    private static boolean player1Turn = true;

    private static final Player player1 = new Player("Ola");
    private static final Player player2 = new Player("Bob");

    private static void playRound(){
        System.out.println("Round " + roundNumber + ":");

        if(player1Turn){
            player1.rollDice();
            player1Turn = false;
        } else {
            player2.rollDice();
            player1Turn = true;
        }
        roundNumber++;
    }

    public static void main(String[] args) {
        while (player1.getPoints() < 100 && player2.getPoints() < 100) {
            playRound();
        }
    }
}
