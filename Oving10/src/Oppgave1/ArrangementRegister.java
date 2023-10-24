package Oppgave1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrangementRegister {
    private final ArrayList<Arrangement> arrangements = new ArrayList<>();

    public void registerArrangement(int number, String name, String place, String organizer, String type, long date) {
        Arrangement arrangement = new Arrangement(number, name, place, organizer, type, date);

        arrangements.add(arrangement);
    }

    public ArrayList<Arrangement> findArrangementsAtPlace(String place) {
        ArrayList<Arrangement> validArrangements = new ArrayList<>();

        for(Arrangement arrangement : arrangements){
            if(arrangement.getPlace().equals(place)) {
                validArrangements.add(arrangement);
            }
        }
        return validArrangements;
    }

    public ArrayList<Arrangement> findArrangementsAtDate(int date){
        ArrayList<Arrangement> validArrangements = new ArrayList<>();

        for(Arrangement arrangement : arrangements){
            if(arrangement.getDate() / 10000 == date) {
                validArrangements.add(arrangement);
            }
        }
        return validArrangements;
    }

    public ArrayList<Arrangement> findArrangementsBetweenDates(int startDate, int endDate){
        ArrayList<Arrangement> validArrangements = new ArrayList<>();

        for(Arrangement arrangement : arrangements){
            if(arrangement.getDate() / 10000 >= startDate && arrangement.getDate() / 10000 <= endDate) {
                validArrangements.add(arrangement);
            }
        }

        validArrangements.sort(Comparator.comparingLong(Arrangement::getDate));
        return validArrangements;
    }

    public String arrangementsSortedByPlace(){
        Arrangement[] arrangementsSortedByPlace = new Arrangement[arrangements.size()];
        arrangements.toArray(arrangementsSortedByPlace);
        Arrays.sort(arrangementsSortedByPlace, Comparator.comparing(Arrangement::getPlace));
        return Arrays.toString(arrangementsSortedByPlace);
    }

    public String arrangementsSortedByType(){
        Arrangement[] arrangementsSortedByType = new Arrangement[arrangements.size()];
        arrangements.toArray(arrangementsSortedByType);
        Arrays.sort(arrangementsSortedByType, Comparator.comparing(Arrangement::getType));
        return Arrays.toString(arrangementsSortedByType);
    }

    public String arrangementsSortedByDate(){
        Arrangement[] arrangementsSortedByDate = new Arrangement[arrangements.size()];
        arrangements.toArray(arrangementsSortedByDate);
        Arrays.sort(arrangementsSortedByDate, Comparator.comparingLong(Arrangement::getDate));
        return Arrays.toString(arrangementsSortedByDate);
    }

    @Override
    public String toString(){
        return arrangements.toString();
    }
}

















