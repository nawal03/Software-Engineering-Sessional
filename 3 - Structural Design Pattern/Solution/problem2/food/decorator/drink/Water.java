package problem2.food.decorator.drink;

import problem2.food.foodInterface.Food;

public class Water extends Drink {
    public Water(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+", Water";
    }

    @Override
    public double price() {
        return super.price()+2;
    }
}
