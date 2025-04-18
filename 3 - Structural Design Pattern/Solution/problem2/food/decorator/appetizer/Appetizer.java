package problem2.food.decorator.appetizer;

import problem2.food.decorator.decoratorAbstract.FoodDecorator;
import problem2.food.foodInterface.Food;

public abstract class Appetizer extends FoodDecorator {
    public Appetizer(Food newFood) {
        super(newFood);
    }
}
