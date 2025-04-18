package problem2.food.factory;

import problem2.food.burger.BeefBurger;
import problem2.food.burger.Burger;
import problem2.food.burger.ChickenBurger;
import problem2.food.burger.VeggiBurger;
import problem2.food.decorator.appetizer.Appetizer;
import problem2.food.decorator.drink.Drink;
import problem2.food.foodInterface.Food;

public class BurgerFactory implements AbstractFoodFactory {
    @Override
    public Burger getBurger(String burger) {
        if(burger.equalsIgnoreCase("veggi")) return new VeggiBurger();
        else if(burger.equalsIgnoreCase("chicken")) return new ChickenBurger();
        else if(burger.equalsIgnoreCase("beef")) return new BeefBurger();
        return null;
    }

    @Override
    public Appetizer getAppetizer(String appetizer, Food newFood) {
        return null;
    }

    @Override
    public Drink getDrink(String drink, Food newFood) {
        return null;
    }
}
