package Oppgave1;

public class FractionCalculator {
    private int numerator = 1;
    private int denominator = 1;
    public FractionCalculator(int numerator, int denominator) throws IllegalArgumentException {
        if(denominator == 0){
            throw new IllegalArgumentException("Denominator cannot be 0");
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public FractionCalculator(int numerator){
        this.numerator = numerator;
    }

    private int GCD(int numerator, int denominator){
        if(denominator == 0) return numerator;

        return GCD(denominator, numerator % denominator);
    }

    private void simplify(){
        int gcd = GCD(this.numerator, this.denominator);

        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public String getFraction(){
        return this.numerator + " / " + this.denominator;
    }

    public void add(int numerator, int denominator){
        int numerator1 = this.numerator * denominator;
        int numerator2 = numerator * this.denominator;

        this.numerator = numerator1 + numerator2;
        this.denominator *= denominator;

        simplify();
    }

    public void subtract(int numerator, int denominator){
        int numerator1 = this.numerator * denominator;
        int numerator2 = numerator * this.denominator;

        this.numerator = numerator1 - numerator2;
        this.denominator *= denominator;

        simplify();
    }

    public void multiply(int numerator, int denominator){
        this.numerator *= numerator;
        this.denominator *= denominator;

        simplify();
    }

    public void divide(int numerator, int denominator){
        this.numerator *= denominator;
        this.denominator *= numerator;

        simplify();
    }
}
