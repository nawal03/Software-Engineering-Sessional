package problem2.food.factory;

import problem2.food.burger.Burger;
import problem2.food.decorator.appetizer.Appetizer;
import problem2.food.decorator.drink.Coffee;
import problem2.food.decorator.drink.Coke;
import problem2.food.decorator.drink.Drink;
import problem2.food.decorator.drink.Water;
import problem2.food.foodInterface.Food;

public class DrinkFactory implements AbstractFoodFactory {
    @Override
    public Burger getBurger(String burger) {
        return null;
    }

    @Override
    public Appetizer getAppetizer(String appetizer, Food newFood) {
        return null;
    }

    @Override
    public Drink getDrink(String drink, Food newFood) {
        if(drink.equalsIgnoreCase("coffee")) return new Coffee(newFood);
        else if(drink.equalsIgnoreCase("water")) return new Water(newFood);
        else if(drink.equalsIgnoreCase("coke")) return new Coke(newFood);
        return null;
    }
}
