package Oppgave2;

public class Menu {
    private final String name;
    private final Dish[] dishes;

    private int totalPrice;

    public Menu(String name, Dish[] dishes){
        this.name = name;
        this.dishes = dishes;

        for(Dish dish : dishes){
            this.totalPrice += dish.getPrice();
        }
    }

    public String getName() {
        return name;
    }

    public Dish[] getDishes() {
        return dishes;
    }

    public int getTotalPrice(){
        return totalPrice;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(name).append(" (").append(totalPrice).append("kr)\n");

        for(Dish dish : dishes){
            sb.append(dish).append("\n");
        }

        return sb.toString();
    }
}
