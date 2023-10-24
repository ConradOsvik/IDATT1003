package Oppgave1;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker("Ola", "Nordmann", 1990, 123456, 2010, 30000, 0.2);
        System.out.println(worker.getPerson().getFirstName());
        System.out.println(worker.getPerson().getLastName());
        System.out.println(worker.getPerson().getBirthYear());
        System.out.println(worker.getWorkerNr());
        System.out.println(worker.getHiringYear());
        System.out.println(worker.getMonthlySalary());
        System.out.println(worker.getTaxRate());
        System.out.println(worker.getMonthlyTax());
        System.out.println(worker.grossSalary());
        System.out.println(worker.getTax());
        System.out.println(worker.getName());
        System.out.println(worker.getAge());
        System.out.println(worker.getIfHiredLongerThan(4));
    }
}
