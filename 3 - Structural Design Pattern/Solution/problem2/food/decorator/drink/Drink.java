package problem2.food.decorator.drink;

import problem2.food.decorator.decoratorAbstract.FoodDecorator;
import problem2.food.foodInterface.Food;

public abstract class Drink extends FoodDecorator {
    public Drink(Food newFood) {
        super(newFood);
    }
}
