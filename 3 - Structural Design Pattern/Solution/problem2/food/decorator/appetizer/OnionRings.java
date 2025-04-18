package problem2.food.decorator.appetizer;

import problem2.food.foodInterface.Food;

public class OnionRings extends Appetizer{
    public OnionRings(Food newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood()+", Onion Rings";
    }

    @Override
    public double price() {
        return super.price()+10;
    }
}
