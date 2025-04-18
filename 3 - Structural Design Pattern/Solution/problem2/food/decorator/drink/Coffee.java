package problem2.food.decorator.drink;

import problem2.food.foodInterface.Food;

public class Coffee extends Drink{
    public Coffee(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+", Coffee";
    }

    @Override
    public double price() {
        return super.price()+5;
    }
}
