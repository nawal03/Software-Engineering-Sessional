package problem2.food.factory;

import problem2.food.burger.Burger;
import problem2.food.decorator.appetizer.Appetizer;
import problem2.food.decorator.appetizer.FrenchFries;
import problem2.food.decorator.appetizer.OnionRings;
import problem2.food.decorator.drink.Drink;
import problem2.food.foodInterface.Food;

public class AppetizerFactory implements AbstractFoodFactory {
    @Override
    public Burger getBurger(String burger) {
        return null;
    }

    @Override
    public Appetizer getAppetizer(String appetizer, Food newFood) {
        if(appetizer.equalsIgnoreCase("french-fries")) return new FrenchFries(newFood);
        else if(appetizer.equalsIgnoreCase("onion-rings")) return new OnionRings(newFood);
        return null;
    }

    @Override
    public Drink getDrink(String drink, Food newFood) {
        return null;
    }
}
