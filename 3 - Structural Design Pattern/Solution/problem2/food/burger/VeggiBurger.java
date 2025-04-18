package problem2.food.burger;

public class VeggiBurger extends Burger{
    @Override
    public String prepareFood() {
        return "Veggi Burger";
    }

    @Override
    public double price() {
        return 45;
    }
}
