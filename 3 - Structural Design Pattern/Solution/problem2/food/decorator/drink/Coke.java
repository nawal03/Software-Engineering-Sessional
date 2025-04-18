package problem2.food.decorator.drink;

import problem2.food.foodInterface.Food;

public class Coke extends Drink {
    public Coke(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+", Coke";
    }

    @Override
    public double price() {
        return super.price()+4;
    }
}
