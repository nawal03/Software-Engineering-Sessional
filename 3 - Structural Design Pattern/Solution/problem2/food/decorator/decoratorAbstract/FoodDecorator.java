package problem2.food.decorator.decoratorAbstract;

import problem2.food.foodInterface.Food;

public abstract class FoodDecorator implements Food {
    private Food newFood;

    public FoodDecorator(Food newFood){
        this.newFood = newFood;
    }

    @Override
    public String prepareFood() {
        return newFood.prepareFood();
    }

    @Override
    public double price() {
        return newFood.price();
    }
}
