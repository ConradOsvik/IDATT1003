package Oppgave1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Worker {
    private Person person;
    private int workerNr;
    private int hiringYear;
    private double monthlySalary;
    private double taxRate;

    private final GregorianCalendar calendar = new GregorianCalendar();
    private final int year = this.calendar.get(Calendar.YEAR);

    public Worker(String firstName, String lastName, int birthYear, int workerNr, int hiringYear, double monthlySalary, double taxRate){
        this.person = new Person(firstName, lastName, birthYear);
        this.workerNr = workerNr;
        this.hiringYear = hiringYear;
        this.monthlySalary = monthlySalary;
        this.taxRate = taxRate;
    }
    public Person getPerson() {
        return this.person;
    }

    public int getWorkerNr() {
        return this.workerNr;
    }

    public int getHiringYear() {
        return this.hiringYear;
    }

    public double getMonthlySalary() {
        return this.monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getMonthlyTax(){
        return this.monthlySalary * this.taxRate;
    }

    public double grossSalary(){
        return this.monthlySalary * 12;
    }

    public double getTax(){
        return 10 * this.getMonthlyTax() + (0.5 * this.getMonthlyTax());
    }

    public String getName(){
        return String.format("%s, %s", this.person.getLastName(), this.person.getFirstName());
    }

    public int getAge(){
        return this.year - this.person.getBirthYear();
    }

    public int getYearsInCompany(){
        return this.year - this.hiringYear;
    }

    public boolean getIfHiredLongerThan(int year){
        return year > this.getYearsInCompany();
    }

    @Override
    public String toString(){
        return String.format("Name: %s\nAge: %d\nWorker number: %d\nHiring year: %d\nMonthly salary: %.2f\nTax rate: %.2f\nMonthly tax: %.2f\nGross salary: %.2f\nTax: %.2f\n", this.getName(), this.getAge(), this.getWorkerNr(), this.getHiringYear(), this.getMonthlySalary(), this.getTaxRate(), this.getMonthlyTax(), this.grossSalary(), this.getTax());
    }
}
