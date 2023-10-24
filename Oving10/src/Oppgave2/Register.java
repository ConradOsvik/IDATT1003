package Oppgave2;

import java.util.ArrayList;
import java.util.List;

public class Register {
    List<Dish> dishes = new ArrayList<>();
    List<Menu> menus = new ArrayList<>();

    public void registerDish(String name, String type, int price){
        Dish dish = new Dish(name, type, price);

        dishes.add(dish);
    }

    public Dish findDish(String name){
        for(Dish dish : dishes){
            if(dish.getName().equals(name)){
                return dish;
            }
        }
        return null;
    }

    public List<Dish> findDishesByType(String type){
        List<Dish> dishes = new ArrayList<>();

        for(Dish dish : this.dishes){
            if(dish.getType().equals(type)){
                dishes.add(dish);
            }
        }

        return dishes;
    }

    public void registerNewMenu(String menuName, String[] dishNames){
        List<Dish> dishes = new ArrayList<>();

        for(String dishName : dishNames){
            Dish dish = findDish(dishName);

            if(dish == null){
                System.out.println("Dish " + dishName + " not found");
                return;
            }

            dishes.add(dish);
        }

        Menu menu = new Menu(menuName, dishes.toArray(new Dish[0]));

        menus.add(menu);
    }

    public Menu[] findMenusBasedOnTotalPrice(int startPrice, int endPrice){
        List<Menu> validMenus = new ArrayList<>();

        for(Menu menu : menus){
            if(menu.getTotalPrice() >= startPrice && menu.getTotalPrice() <= endPrice){
                validMenus.add(menu);
            }
        }

        return validMenus.toArray(new Menu[0]);
    }
}





