package Oppgave1;

public class Currency {
    String currencyName;
    double currencyAmount;
    double currencyExchangeRate;
    public Currency(String name, double amount, double exchangeRate){
        currencyName = name;
        currencyAmount = amount
        currencyExchangeRate = exchangeRate;
    }

    public double convertToNok(){
        return currencyAmount * currencyExchangeRate;
    }

    public double convertFromNok(){
        return currencyAmount / currencyExchangeRate;
    }

    public static void main(String[] args) {

    }
}
