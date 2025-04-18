package problem2.food.decorator.cheese;

import problem2.food.decorator.decoratorAbstract.FoodDecorator;
import problem2.food.foodInterface.Food;

public class Cheese extends FoodDecorator {
    public Cheese(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+", Cheese";
    }

    @Override
    public double price() {
        return super.price()+7;
    }
}
