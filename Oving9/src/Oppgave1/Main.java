package Oppgave1;

public class Main {
    public static void main(String[] args) {
        final Student student = new Student("Ola", 0);
        final TaskOverview taskOverview = new TaskOverview(student);

        taskOverview.addStudent("Kari", 5);
        System.out.println(student);
        System.out.println(taskOverview);
        student.addTasks(1);
        taskOverview.addTasksToStudent("Ola", 1);
        System.out.println(taskOverview.getTasksByStudent("Ola"));
    }
}
