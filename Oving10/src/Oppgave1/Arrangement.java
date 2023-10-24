package Oppgave1;

public class Arrangement {
    private final int number;
    private final String name;
    private final String place;
    private final String organizer;
    private final String type;
    private final long date;

    public Arrangement(int number, String name, String place, String organizer, String type, long date){
        this.number = number;
        this.name = name;
        this.place = place;
        this.organizer = organizer;
        this.type = type;
        this.date = date;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getPlace() {
        return place;
    }

    public String getOrganizer() {
        return organizer;
    }

    public String getType() {
        return type;
    }

    public long getDate() {
        return date;
    }

    @Override
    public String toString(){
        return this.name + " at " + this.place + " on " + this.date + " organized by " + this.organizer + " (" + this.type + ")";
    }
}
