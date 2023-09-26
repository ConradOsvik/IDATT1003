package Oppgave1;

public class Currency {
    private final String name;
    private final double exchangeRate;
    public Currency(String name, double exchangeRate){
        this.name = name;
        this.exchangeRate = exchangeRate;
    }

    public String getName(){
        return this.name;
    }

    public double convertToNok(double amount){
        return amount * this.exchangeRate;
    }

    public double convertFromNok(double amount){
        return amount / this.exchangeRate;
    }

    public static void main(String[] args) {

    }
}
