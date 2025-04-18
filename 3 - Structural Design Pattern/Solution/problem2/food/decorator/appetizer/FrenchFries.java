package problem2.food.decorator.appetizer;

import problem2.food.foodInterface.Food;

public class FrenchFries extends Appetizer{
    public FrenchFries(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+", French Fries";
    }

    @Override
    public double price() {
        return super.price()+15;
    }
}
