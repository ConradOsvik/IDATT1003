package Oppgave1;

public class Student {
    private final String name;
    private int tasks;

    public Student(String name, int tasks) {
        this.name = name;
        this.tasks = tasks;
    }

    public String getName(){
        return this.name;
    }

    public int getTasks(){
        return this.tasks;
    }

    public void addTasks(int amount){
        this.tasks += amount;
    }

    public String toString(){
        return this.name + " has done " + this.tasks + " tasks.";
    }
}
