package Oppgave1;

import java.util.ArrayList;

public class TaskOverview {
    private final ArrayList<Student> students = new ArrayList<Student>();
    private int numberOfStudents = 0;

    public TaskOverview(){
    }

    public TaskOverview(Student student){
        this.students.add(student);
        this.numberOfStudents++;
    }

    public ArrayList<Student> getRegisteredStudents(){
        return this.students;
    }

    public int getTasksByStudent(String name){
        for (Student student : this.students){
            if (student.getName().equals(name)){
                return student.getTasks();
            }
        }
        return -1;
    }

    public void addStudent(String name, int tasks){
        this.students.add(new Student(name, tasks));
    }

    public void addTasksToStudent(String name, int amount){
        for (Student student : this.students){
            if (student.getName().equals(name)){
                student.addTasks(amount);
            }
        }
    }

    public String toString(){
        return "There are " + this.numberOfStudents + " students registered.";
    }
}
