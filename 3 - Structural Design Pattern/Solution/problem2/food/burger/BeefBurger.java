package problem2.food.burger;

public class BeefBurger extends Burger{
    @Override
    public String prepareFood() {
        return "Beef Burger";
    }

    @Override
    public double price() {
        return 60;
    }
}
