package problem2.food.factory;

import problem2.food.burger.Burger;
import problem2.food.decorator.appetizer.Appetizer;
import problem2.food.decorator.drink.Drink;
import problem2.food.foodInterface.Food;

public interface AbstractFoodFactory {
    public Burger getBurger(String burger);
    public Appetizer getAppetizer(String appetizer, Food newFood);
    public Drink getDrink(String drink, Food newFood);
}
