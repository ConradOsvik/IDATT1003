package Oppgave2;

public class Dish {
    private final String name;
    private final String type;
    private final int price;

    public Dish(String name, String type, int price){
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return name + " (" + type + ") - " + price + "kr";
    }
}
