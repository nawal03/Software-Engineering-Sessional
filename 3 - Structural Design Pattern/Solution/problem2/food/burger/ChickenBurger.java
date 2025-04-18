package problem2.food.burger;

public class ChickenBurger extends Burger{
    @Override
    public String prepareFood() {
        return "Chicken Burger";
    }

    @Override
    public double price() {
        return 55;
    }
}
